package com.chatbot.app.models;

import javax.persistence.Entity;

import javax.persistence.Id;
 

@Entity
public class Film {
	
	@Id
	private Long id;
	private String titre;
	private String duree;
	private String heure_debut;
	private String realisateur;
	private String description;
	private String photo;
 
	private String dateProjection;
	private String nomCinema;
	public Film() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Film(Long id, String titre, String duree, String heure_debut, String realisateur, String description,
			String photo, String dateProjection, String nomCinema) {
		super();
		this.id = id;
		this.titre = titre;
		this.duree = duree;
		this.heure_debut = heure_debut;
		this.realisateur = realisateur;
		this.description = description;
		this.photo = photo;
		this.dateProjection = dateProjection;
		this.nomCinema = nomCinema;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDuree() {
		return duree;
	}
	public void setDuree(String duree) {
		this.duree = duree;
	}
	public String getHeure_debut() {
		return heure_debut;
	}
	public void setHeure_debut(String heure_debut) {
		this.heure_debut = heure_debut;
	}
	public String getRealisateur() {
		return realisateur;
	}
	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getDateProjection() {
		return dateProjection;
	}
	public void setDateProjection(String dateProjection) {
		this.dateProjection = dateProjection;
	}
	public String getNomCinema() {
		return nomCinema;
	}
	public void setNomCinema(String nomCinema) {
		this.nomCinema = nomCinema;
	}
	
	 
 
	
	

}
