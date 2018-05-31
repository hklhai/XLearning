package cn.edu.ncut.test.nlp;

import edu.stanford.nlp.ie.util.RelationTriple;
import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.naturalli.NaturalLogicAnnotations;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.util.CoreMap;
import org.junit.Test;

import java.io.IOException;
import java.util.Collection;
import java.util.Properties;

/**
 * Created by hadoop on 18-5-31.
 */
public class TestNLP {

    public static String textEn = "Joe Smith was born in California. " +
            "In 2017, he went to Paris, France in the summer. " +
            "His flight left at 3:00pm on July 10th, 2017. " +
            "After eating some escargot for the first time, Joe said, \"That was delicious!\" " +
            "He sent a postcard to his sister Jane Smith. " +
            "After hearing about Joe's trip, Jane decided she might go to France one day.";
//    public static String text = "CHICAGO (AP) — Citing high fuel prices, United Airlines said Friday it\n" +
//            "has increased fares by $6 per round trip on flights to some cities also\n" +
//            "served by lower-cost carriers. American Airlines, a unit of AMR,\n" +
//            "immediately matched the move, spokesman Tim Wagner said.\n" +
//            "United, a unit of UAL, said the increase took effect Thursday night\n" +
//            "and applies to most routes where it competes against discount\n" +
//            "carriers, such as Chicago to Dallas and Atlanta and Denver to San\n" +
//            "Francisco, Los Angeles and New York";

    public static String textZh = "什么时候官员的手机号码不用给企业家留了，企业家不用靠给官员打电话就能解决问题了，什么时候政风官风就好转了，正常的政商关系就开始形成了。不求官\n" +
            "、不求人，能办事，这是一个地方衡量一个地方政商环境的重要指标之一。";

    @Test
    public void testEnTriple() {
        // set up pipeline properties
        Properties props = new Properties();
        // set the list of annotators to run
        props.setProperty("annotators", "tokenize,ssplit,pos,lemma,ner,depparse,natlog,openie,parse,dcoref,relation");
        props.setProperty("annotators", "tokenize,ssplit,pos,lemma,ner,depparse,natlog,openie,parse,relation");
        // set a property for an annotator, in this case the coref annotator is being set to use the neural algorithm
//        props.setProperty("coref.algorithm", "neural");
        // build pipeline
        StanfordCoreNLP pipeline = new StanfordCoreNLP(props);

        Annotation doc = new Annotation(textEn);
        pipeline.annotate(doc);

        for (CoreMap sentence : doc.get(CoreAnnotations.SentencesAnnotation.class)) {
            Collection<RelationTriple> triples = sentence.get(NaturalLogicAnnotations.RelationTriplesAnnotation.class);

            for (RelationTriple triple : triples) {
                System.out.println(triple.confidence + ":" + "(" + triple.subjectLemmaGloss() + " , " +
                        triple.relationLemmaGloss() + " , " + triple.objectLemmaGloss() + ")");
            }
        }

    }

    @Test
    public void testZhTriple() throws IOException {
        Properties props = new Properties();
        props.load(this.getClass().getResourceAsStream("/StanfordCoreNLP-chinese.properties"));

//        props.setProperty("annotators", "tokenize,ssplit,pos,lemma,ner,depparse,natlog,openie,parse,dcoref,relation");
//        props.setProperty("customAnnotatorClass.segment", "edu.stanford.nlp.pipeline.ChineseSegmentAnnotator");
//        props.setProperty("coref.algorithm", "neural");
        StanfordCoreNLP pipeline = new StanfordCoreNLP(props);

        Annotation doc = new Annotation(textZh);
        pipeline.annotate(doc);

        for (CoreMap sentence : doc.get(CoreAnnotations.SentencesAnnotation.class)) {
            Collection<RelationTriple> triples = sentence.get(NaturalLogicAnnotations.RelationTriplesAnnotation.class);

            for (RelationTriple triple : triples) {
                System.out.println(triple.confidence + ":" + "(" + triple.subjectLemmaGloss() + " , " +
                        triple.relationLemmaGloss() + " , " + triple.objectLemmaGloss() + ")");
            }
        }

    }

}
