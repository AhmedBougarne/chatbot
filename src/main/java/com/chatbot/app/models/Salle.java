package com.chatbot.app.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Salle {
	
	@Id
	private Long id;
	private String name;
	private int nbrPlaces;
	public Salle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Salle(Long id, String name, int nbrPlaces) {
		super();
		this.id = id;
		this.name = name;
		this.nbrPlaces = nbrPlaces;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNbrPlaces() {
		return nbrPlaces;
	}
	public void setNbrPlaces(int nbrPlaces) {
		this.nbrPlaces = nbrPlaces;
	}
	
	

}
