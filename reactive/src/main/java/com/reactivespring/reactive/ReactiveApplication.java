package com.reactivespring.reactive;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.reactivespring.reactive.webclient.ReactiveWebClient;

@SpringBootApplication
public class ReactiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveApplication.class, args);

		ScheduledExecutorService executorService;
		executorService = Executors.newSingleThreadScheduledExecutor();
		executorService.scheduleAtFixedRate(ReactiveApplication::run, 1, 1, TimeUnit.SECONDS);
	}

	private static void run() {
		ReactiveWebClient reactiveWebClient = new ReactiveWebClient();
		reactiveWebClient.consume();
	}
}
