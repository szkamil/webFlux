//package hello;
//
//import org.springframework.http.MediaType;
//import org.springframework.web.reactive.function.client.ClientResponse;
//import org.springframework.web.reactive.function.client.WebClient;
//import org.springframework.http.MediaType;
//import org.springframework.stereotype.Component;
//import org.springframework.web.reactive.function.client.ClientResponse;
//import org.springframework.web.reactive.function.client.WebClient;
//import org.springframework.web.reactive.function.server.ServerResponse;
//import reactor.core.publisher.Mono;
//
//import reactor.core.publisher.Mono;
//
//public class TestRoute {
//	private WebClient client = WebClient.create("http://localhost:8080");
//	public void test () {
//
//        WebClient client = WebClient.create("http://example.com");
//
//        Mono<String> test = client.get()
//                .url("/accounts/{id}", 1L)
//                .accept(APPLICATION_JSON)
//                .exchange(request)
//                .flatMap(response -> response.bodyToMono(String.class));
//    }
//}
