package io.codewithridhwan.streamdatacollector.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Config {
    @Value("${meetup.websocket.url}")
    private String socketUrl;

    public String getSocketUrl() {
        return socketUrl;
    }
}
