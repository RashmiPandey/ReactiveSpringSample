package com.reactivespring.reactive.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reactive {

	private String id;
	private String name;

	
	public Reactive() {}
	public Reactive(String id, String name) {
		this.id=id;
		this.name=name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	  public String toString() {
	    return "Greetings... {" +
	        "name='" + name + '\'' +
	        "id='" + id + '\'' +
	        '}';
	  }
}
