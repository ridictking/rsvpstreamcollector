package io.codewithridhwan.streamdatacollector;

import io.codewithridhwan.streamdatacollector.util.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.socket.client.WebSocketClient;
import org.springframework.web.socket.client.standard.StandardWebSocketClient;

@SpringBootApplication
public class StreamDataCollectorApplication {
	@Autowired
	private Config config;
	//private static final String MEETUP_RSVP_ENDPOINT = con

	public static void main(String[] args) {
		SpringApplication.run(StreamDataCollectorApplication.class, args);
	}

	@Bean
	public ApplicationRunner initializeConnection(StreamDataCollectorWebsocketHandler handler){
		return args -> {
			WebSocketClient socketClient = new StandardWebSocketClient();
			socketClient.doHandshake(handler,config.getSocketUrl());
		};
	}
}
