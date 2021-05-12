package io.codewithridhwan.streamdatacollector;

import io.codewithridhwan.streamdatacollector.config.DataCollectorKafkaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;

@Component
public class StreamDataCollectorWebsocketHandler extends AbstractWebSocketHandler {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final DataCollectorKafkaProducer kafkaProducer;

    public StreamDataCollectorWebsocketHandler(DataCollectorKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @Override
    public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
        logger.info(message.getPayload().toString());
        kafkaProducer.sendMessage(message);
    }
}
