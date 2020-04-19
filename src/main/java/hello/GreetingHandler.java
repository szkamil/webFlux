package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;


@Component
public class GreetingHandler {
	@Autowired
	EndpointCaller endpointCaller;

	public Mono<ServerResponse> hello(ServerRequest request) {

		String healthcheckUrl;
		String splunkIndex;


		healthcheckUrl = request.headers().header("healtcheckUrl").toString().replace("[", "").replace("]", "");
		splunkIndex = request.headers().header("splunkIndex").toString();

		System.out.println(healthcheckUrl);
		System.out.println(splunkIndex);
		endpointCaller.getResult(healthcheckUrl, splunkIndex);

		return ServerResponse.ok().build();


	}
}
