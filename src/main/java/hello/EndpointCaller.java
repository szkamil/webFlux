package hello;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;


@Component
public class EndpointCaller {


    private String url;
//    private WebClient client;

//    private Mono<ClientResponse> result = client.get()
//            .accept(MediaType.TEXT_PLAIN)
//            .exchange();

    public void getResult(String url, String index) {

        WebClient client = WebClient.create(url);
//
//            client.get()
//			.uri("/")
//			.retrieve()
//                    .bodyToMono(String.class);
        Mono<String> employeeMono = client.get()
                .uri("/" )
                .retrieve()
                .bodyToMono(String.class);

        employeeMono.subscribe(System.out::println);

//        return employeeMono;


    }
}
