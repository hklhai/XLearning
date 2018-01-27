package cn.edu.ncut.controller;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Ocean lin on 2017/10/10.
 */
@Configuration
public class ESConfig {

    private static final String HOST = "127.0.0.1";
    private static final String CLUSTER_NAME = "elasticsearch";

    @Bean
    public TransportClient client() throws UnknownHostException {
        InetSocketTransportAddress node1 = new InetSocketTransportAddress(
                InetAddress.getByName(HOST), 9300);

        //可以new 三个节点，将node1放入,还可以放入node2...
        Settings settings = Settings.builder().put("cluster.name", CLUSTER_NAME)
                .put("client.transport.sniff", true).build();

        TransportClient client = new PreBuiltTransportClient(settings);
        client.addTransportAddress(node1);
        return client;
    }

}
