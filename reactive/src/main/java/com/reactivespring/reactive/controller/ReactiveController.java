package com.reactivespring.reactive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reactivespring.reactive.model.Reactive;
import com.reactivespring.reactive.service.ReactiveService;

import reactor.core.publisher.Flux;

@RestController
public class ReactiveController {

	@Autowired
	ReactiveService reactiveService;

	@GetMapping("/reactive")
	private Flux<Reactive> getAllEmployees() {
		Flux<Reactive> reactive =  reactiveService.getReactive();
		return reactive;
	}

}
