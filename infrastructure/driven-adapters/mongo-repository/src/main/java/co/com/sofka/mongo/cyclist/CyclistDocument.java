package co.com.sofka.mongo.cyclist;

import co.com.sofka.model.country.Country;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "cyclist")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CyclistDocument {
    @Id
    private String id;
    private String fullName;
    private Integer competitionNumber;
    private Country nationality;
}
