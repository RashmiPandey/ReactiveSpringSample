package com.reactivespring.reactive.webclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.reactive.function.client.WebClient;

import com.reactivespring.reactive.model.Reactive;

import reactor.core.publisher.Flux;

public class ReactiveWebClient {

	private static final Logger logger = LoggerFactory.getLogger(ReactiveWebClient.class);

	WebClient client = WebClient.create("http://localhost:8080");

	public void consume() {

		Flux<Reactive> reactiveFlux = client.get().uri("/reactive").retrieve().bodyToFlux(Reactive.class);

		reactiveFlux.subscribe(reactive -> {
			logger.info(reactive.toString());
		});
	}
}
