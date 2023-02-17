package co.com.sofka.mongo.country;

import co.com.sofka.model.country.Country;
import co.com.sofka.mongo.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class MongoRepositoryAdapterCountry extends AdapterOperations<Country, CountryDocument, String, MongoDBRepositoryCountry>
// implements ModelRepository from domain
{

    public MongoRepositoryAdapterCountry(MongoDBRepositoryCountry repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, Country.class));
    }
}
