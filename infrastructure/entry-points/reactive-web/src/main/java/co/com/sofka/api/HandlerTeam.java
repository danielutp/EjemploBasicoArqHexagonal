package co.com.sofka.api;

import co.com.sofka.model.team.Team;
import co.com.sofka.usecase.createteam.CreateTeamUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class HandlerTeam {
    private final CreateTeamUseCase createTeamUseCase;
    public Mono<ServerResponse> crearTeamPOSTUseCase(ServerRequest serverRequest) {
        return serverRequest.bodyToMono(Team.class)
        .flatMap(e-> ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(createTeamUseCase.crearTeam(e), Team.class));
    }

}
