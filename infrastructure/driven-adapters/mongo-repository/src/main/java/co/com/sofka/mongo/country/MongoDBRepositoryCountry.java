package co.com.sofka.mongo.country;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;

public interface MongoDBRepositoryCountry extends ReactiveMongoRepository<CountryDocument, String>, ReactiveQueryByExampleExecutor<CountryDocument> {
}
