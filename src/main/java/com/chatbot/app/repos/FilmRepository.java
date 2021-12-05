package com.chatbot.app.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chatbot.app.models.Film;
 

public interface FilmRepository extends JpaRepository<Film,Long>{
	public List<Film> findByDateProjection(String dateProjection);
	public List<Film> findByNomCinema(String nomCinema);
 

}
 