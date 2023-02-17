package co.com.sofka.model.cyclist;
import co.com.sofka.model.country.Country;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(toBuilder = true)
public class Cyclist {
    private String id;
    private String fullName;
    private Integer competitionNumber;
    private Country nationality;
}
