package cn.edu.ncut.controller;

import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.search.aggregations.Aggregation;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.bucket.histogram.DateHistogramInterval;
import org.elasticsearch.search.aggregations.bucket.histogram.Histogram;
import org.elasticsearch.search.aggregations.bucket.terms.InternalTerms;
import org.elasticsearch.search.aggregations.bucket.terms.StringTerms;
import org.elasticsearch.search.aggregations.metrics.avg.Avg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by Ocean lin on 2018/1/27.
 *
 * @author Ocean lin
 */
@RestController
public class EmployeeAggrController {

    @Autowired
    private TransportClient client;


    @GetMapping("/employe/aggr")
    @ResponseBody
    public ResponseEntity employeeAggr() {
        SearchResponse response = client.prepareSearch("company")
                .setTypes("employee")
                .addAggregation(AggregationBuilders.terms("group_by_country").field("country")
                        .subAggregation(AggregationBuilders.dateHistogram("group_by_join_date").field("join_date")
                                .dateHistogramInterval(DateHistogramInterval.YEAR).
                                        subAggregation(AggregationBuilders.avg("avg_salary").field("salary"))))
                .execute().actionGet();

        Map<String, Aggregation> aggregationMap = response.getAggregations().asMap();
        StringTerms groupByCountry = (StringTerms) aggregationMap.get("group_by_country");

        Iterator<StringTerms.Bucket> groupByCountryBucketIterator = groupByCountry.getBuckets().iterator();
        while (groupByCountryBucketIterator.hasNext()) {
            InternalTerms.Bucket groupByCountryBucket = groupByCountryBucketIterator.next();
            System.out.println(groupByCountryBucket.getKey() + ":" + groupByCountryBucket.getDocCount());

            Histogram groupByJoinDate = (Histogram) groupByCountryBucket.getAggregations().asMap().get("group_by_join_date");
            Iterator<? extends Histogram.Bucket> groupByJoinDateBucketIterator = groupByJoinDate.getBuckets().iterator();
            while (groupByJoinDateBucketIterator.hasNext()) {
                org.elasticsearch.search.aggregations.bucket.histogram.Histogram.Bucket groupByJoinDateBucket = groupByJoinDateBucketIterator.next();
                System.out.println(groupByJoinDateBucket.getKey() + ":" + groupByJoinDateBucket.getDocCount());

                Avg avg = (Avg) groupByJoinDateBucket.getAggregations().asMap().get("avg_salary");
                System.out.println(avg.getValue());
            }
        }


        return new ResponseEntity(aggregationMap, HttpStatus.OK);
    }

}
