package io.codewithridhwan.streamdatacollector.api;

import io.codewithridhwan.streamdatacollector.model.MeetUpRsvp;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class RsvpController {

    private final ReactiveMongoTemplate mongoTemplate;

    public RsvpController(ReactiveMongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @GetMapping(value = "/rsvps", produces= MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<MeetUpRsvp> serveRsvp(){
        return mongoTemplate.tail(
                new Query(),MeetUpRsvp.class).share();
    }
}
