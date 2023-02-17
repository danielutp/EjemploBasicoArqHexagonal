package co.com.sofka.mongo.team;

import co.com.sofka.model.country.Country;
import co.com.sofka.model.cyclist.Cyclist;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Document()
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamDocument {
    @Id
    private String id;
    private String code;
    private Country country;
    private Set<Cyclist> cyclistList;
}
