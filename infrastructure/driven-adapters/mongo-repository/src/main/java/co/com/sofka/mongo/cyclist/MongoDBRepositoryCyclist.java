package co.com.sofka.mongo.cyclist;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;

public interface MongoDBRepositoryCyclist extends ReactiveMongoRepository<CyclistDocument, String>, ReactiveQueryByExampleExecutor<CyclistDocument> {
}
