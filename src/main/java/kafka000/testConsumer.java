package kafka000;
//https://www.baeldung.com/kafka-flink-data-pipeline

import java.util.Date;
import java.util.Collections;
import java.util.Properties;

public class testConsumer {
    private final static String TOPIC = "Igor";
    private final static String BOOTSTRAP_SERVERS =
            "localhost:9092"; //,localhost:9093,localhost:9094";
/*
    public static FlinkKafkaConsumer011<String> createStringConsumerForTopic(
            String topic, String kafkaAddress, String kafkaGroup ) {

        Properties props = new Properties();
        props.setProperty("bootstrap.servers", kafkaAddress);
        props.setProperty("group.id", kafkaGroup);
        FlinkKafkaConsumer011<String> consumer = new FlinkKafkaConsumer011<>(
                topic, new SimpleStringSchema(), props);

        return consumer;
    }
    */

    public static void main(String[] arg){

        System.out.println("consumer starts...." + (new Date()).toString());
        System.out.println("topic: " + TOPIC);
    }
}
