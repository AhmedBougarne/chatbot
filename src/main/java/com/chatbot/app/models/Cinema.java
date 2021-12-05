package com.chatbot.app.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cinema {
	
	@Id
	private Long id;
	private String name;
	private int nbrSalles;
	
	
	public Cinema() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cinema(Long id, String name, int nbrSalles) {
		super();
		this.id = id;
		this.name = name;
		this.nbrSalles = nbrSalles;
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
	public int getNbrSalles() {
		return nbrSalles;
	}
	public void setNbrSalles(int nbrSalles) {
		this.nbrSalles = nbrSalles;
	}
	 

}
