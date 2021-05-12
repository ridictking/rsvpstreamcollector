package io.codewithridhwan.streamdatacollector.dao;

import io.codewithridhwan.streamdatacollector.model.MeetUpRsvp;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface DataRepository extends ReactiveMongoRepository<MeetUpRsvp, String> {
}
