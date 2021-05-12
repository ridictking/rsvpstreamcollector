package io.codewithridhwan.streamdatacollector.config;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.WebSocketMessage;

@Component
@EnableBinding(Source.class)
public class DataCollectorKafkaProducer {
    private static final int SENDING_MESSAGE_TIMEOUT_MS = 10000;

    private final Source source;

    public DataCollectorKafkaProducer(Source source) {
        this.source = source;
    }

    public void sendMessage(WebSocketMessage<?> message){
        source.output()
                .send(MessageBuilder.withPayload(message.getPayload())
                        .build(),SENDING_MESSAGE_TIMEOUT_MS);
    }
}
