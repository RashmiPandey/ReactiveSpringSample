package com.reactivespring.reactive.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reactivespring.reactive.model.Reactive;
import com.reactivespring.reactive.repo.ReactiveRepository;

import reactor.core.publisher.Flux;

@Service
public class ReactiveService {

	@Autowired
	ReactiveRepository reactiveRepository;

	public Flux<Reactive> getReactive() {
		Flux<Reactive> reactive = reactiveRepository.getReactiveInfo();
		return reactive;
	}
}
