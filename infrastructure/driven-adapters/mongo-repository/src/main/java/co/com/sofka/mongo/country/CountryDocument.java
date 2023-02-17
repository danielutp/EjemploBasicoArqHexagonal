package co.com.sofka.mongo.country;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "country")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CountryDocument {
        @Id
        private String id;
        private String name;
        private String code;
    }

