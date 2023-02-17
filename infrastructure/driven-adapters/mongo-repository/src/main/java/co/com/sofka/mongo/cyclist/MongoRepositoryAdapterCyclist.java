package co.com.sofka.mongo.cyclist;

import co.com.sofka.model.cyclist.Cyclist;
import co.com.sofka.mongo.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class MongoRepositoryAdapterCyclist extends AdapterOperations<Cyclist, CyclistDocument, String, MongoDBRepositoryCyclist>
// implements ModelRepository from domain
{

    public MongoRepositoryAdapterCyclist(MongoDBRepositoryCyclist repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, Cyclist.class));
    }
}
