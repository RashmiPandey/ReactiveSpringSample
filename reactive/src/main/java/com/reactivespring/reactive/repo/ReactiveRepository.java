package com.reactivespring.reactive.repo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.reactivespring.reactive.model.Reactive;

import reactor.core.publisher.Flux;

@Repository
public class ReactiveRepository {

	public Flux<Reactive> getReactiveInfo() {
		Map<String, Reactive> reactiveData = new HashMap<>();
		reactiveData.put("1", new Reactive("1", "Anto"));
		return Flux.fromIterable(reactiveData.values());
	}
}
