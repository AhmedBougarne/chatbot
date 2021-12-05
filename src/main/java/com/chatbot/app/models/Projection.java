package com.chatbot.app.models;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.Id;
 

@Entity
public class Projection {
	
	@Id
	private Long id;
	private Date dateProjection;
	private double prix;
	private Long idCinema;
	public Projection() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Projection(Long id, Date dateProjection, double prix, Long idCinema) {
		super();
		this.id = id;
		this.dateProjection = dateProjection;
		this.prix = prix;
		this.idCinema = idCinema;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateProjection() {
		return dateProjection;
	}
	public void setDateProjection(Date dateProjection) {
		this.dateProjection = dateProjection;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public Long getIdCinema() {
		return idCinema;
	}
	public void setIdCinema(Long idCinema) {
		this.idCinema = idCinema;
	}
	
	
	

}
