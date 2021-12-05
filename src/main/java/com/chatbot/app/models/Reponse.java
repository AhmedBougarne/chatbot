package com.chatbot.app.models;

import java.time.LocalDateTime;

public class Reponse {
	
	private String message;
	private LocalDateTime dateTime;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	public Reponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reponse(String message, LocalDateTime dateTime) {
		super();
		this.message = message;
		this.dateTime = dateTime;
	}
	
	

}
