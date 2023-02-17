package co.com.sofka.model.team;
import co.com.sofka.model.country.Country;
import co.com.sofka.model.cyclist.Cyclist;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;


@Data
@Builder(toBuilder = true)
public class Team {
    private String id;
    private String code;
    private Country country;
    private Set<Cyclist> cyclistList;
}
