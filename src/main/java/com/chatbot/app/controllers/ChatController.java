package com.chatbot.app.controllers;

import java.io.FileNotFoundException;



import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.chatbot.app.models.Film;
import com.chatbot.app.models.Reponse;
import com.chatbot.app.repos.FilmRepository;
 
 

@RestController
@CrossOrigin("*")
public class ChatController {
	
	@Autowired
	FilmRepository filmRepository;
	
 
	Reponse reponse;
	
	@GetMapping(value = "/chat")
	public Reponse chat(@RequestParam(name = "message") String input) throws FileNotFoundException, IOException
	{
		
		
		
		
	
		
		ArrayList<String> thankyou = new ArrayList<>(Arrays.asList("thank you", "thank you!", "thank you.","thanx","thank you for your help", "thank you for you help!", "thank you for your help."));
		ArrayList<String> merci = new ArrayList<>(Arrays.asList("merci", "merci!", "merci.","merci pour votre aide","merci pour votre aide!", "merci pour votre aide."));
		ArrayList<String> greeting = new ArrayList<>(Arrays.asList("hi", "hello", "hey","hi.","hello.","hey.","hi!","hello!","hey!"));
		ArrayList<String> salut = new ArrayList<>(Arrays.asList("bonjour", "bonjour!", "bonjour.","bonsoir.","bonsoir!","bonsoir","salut","salut.","salut!","comment vas-tu?","comment va tu?","comment va tu"));
		ArrayList<String> greeting2 = new ArrayList<>(Arrays.asList("hi, how are you?", "hello, how are you?", "how are you?","how are you.","how are you doing?","how are you",
				                                                    "hi how are you", "hello how are you","hi, how are you.", "hello, how are you."));
		
		ArrayList<String> goToCinema = new ArrayList<>(Arrays.asList("i would like to go to the cinema", "i like to go to the cinema", "can i go to the cinema",
				                                                      "i like to go cinema", "i like go to the cinema", "i like to go cinema.",
				                                                     "i would like to go to the cinema.", "i like to go to the cinema.", "can i go to the cinema?",
				                                                      "can you tell me the movies slots around?","i want go to the cinema","i wanna go to the cinema",
				                                                      "i would like go to the cinema.", "i would like go to the cinema", "i would like go the cinema.",
				                                                      "going to cinema","going to the cinema","i wanna go to cinema"));
		ArrayList<String> allerCinema = new ArrayList<>(Arrays.asList("je veux aller au cinema", "j'aime bien aller au cinema.", "je veux aller au cinema.","j'aime bien aller au cinema"));
		ArrayList<String> dateForCinema1 = new ArrayList<>(Arrays.asList("1-11-2021", "	2-11-2021", "3-11-2021","4-11-2021","5-11-2021","6-11-2021","7-11-2021","8-11-2021","9-11-2021"
				                                                         ,"1O-11-2021", "11-11-2021","12-11-2021", "33-11-2021","14-11-2021","15-11-2021","16-11-2021","17-11-2021","18-11-2021","19-11-2021"));
		ArrayList<String> dateForCinema2 = new ArrayList<>(Arrays.asList("1/11/2021", "	2/11/2021", "3/11/2021","4/11/2021","5/11/2021","6/11/2021","7/11/2021","8/11/2021","9/11/2021"
                                                                         ,"1O/11/2021", "11/11/2021","12/11/2021", "33/11/2021","14/11/2021","15/11/2021","16/11/2021","17/11/2021","18/11/2021","19/11/2021"));
		ArrayList<String> days = new ArrayList<>(Arrays.asList("sunday", "monday", "tuesday","thursday","wednesday","friday","saturday"));
		ArrayList<String> cinemas = new ArrayList<>(Arrays.asList("megarama", "renaissance", "cinemaatlas"));
		
		 reponse = new Reponse();
		 String langue = "";
	     if(greeting.contains(input.toLowerCase())) {
              if(input.equalsIgnoreCase("hi.")||input.equalsIgnoreCase("hi!")||input.equalsIgnoreCase("hi")) {
            	  reponse.setMessage("Hi there! can I help you?");
	    	 }
              else {
            	  reponse.setMessage("Hi! do you have any questions?");
              }
	    	 
	     }
         else if(salut.contains(input.toLowerCase())) {
	    	 
	    	 reponse.setMessage("Bonjour! je peux vous aider?");
	    	 langue="fr";
	     }
         else if(greeting2.contains(input.toLowerCase())) {
	    	 
	    	 reponse.setMessage("I'm good, can I help you?");
	    	 langue="ang";
	     }
	     else if(goToCinema.contains(input.toLowerCase())) {
	    	 
	    	 reponse.setMessage("Tell me when would you like to go.");
	     }
         else if(allerCinema.contains(input.toLowerCase())) {
	    	 
	    	 reponse.setMessage("Dis-mois quand vous aimeriez partir.");
	     }
	     else if(dateForCinema1.contains(input.toLowerCase())||dateForCinema2.contains(input.toLowerCase())) {
	    	 reponse.setMessage("Quel cinema aimeriez-vous aller?");
	     }
	     /*
	     else if(cinemas.contains(input.toLowerCase()) && langue.equals("ang")) {
	     
	    	 List<Film> filmsByCinema =  filmRepository.findByNomCinema(input.toLowerCase());
	    	 List<Film> filmsBydate =  filmRepository.findByDateProjection(input.toLowerCase());
	    	 
	    	 if(!filmsByCinema.isEmpty()) {
	    		 String str ="Here are the films around you : " ;
		    	 for(Film film: filmsByCinema) {
		    		 str=str+"-"+film.getTitre()+" starting at "+film.getHeure_debut()+"   \n";
		    	 }
		    	 reponse.setMessage(str);
		    	 
	    	 }
	    	 else {
	    		 reponse.setMessage("There is no film available, try another date.");
	    	 }
	    	  
	    	  
	     }*/
	     else if(cinemas.contains(input.toLowerCase()) ) {
		     
	    	 List<Film> filmsByCinema =  filmRepository.findByNomCinema(input.toLowerCase());
	    	 List<Film> filmsBydate =  filmRepository.findByDateProjection(input.toLowerCase());
	    	 
	    	 if(!filmsByCinema.isEmpty()) {
	    		 String str ="Voici les films disponibles : " ;
		    	 for(Film film: filmsByCinema) {
		    		 str=str+"-"+film.getTitre()+" à partir de "+film.getHeure_debut()+"   \n";
		    	 }
		    	 reponse.setMessage(str);
		    	 
	    	 }
	    	 else {
	    		 reponse.setMessage("Il n'y a pas de film disponible, essayez une autre date.");
	    	 }
	    	  
	    	  
	     }
	     else if(days.contains(input.toLowerCase())) {
	    	 reponse.setMessage("Do you mean the next "+input+"?");
	     }
	     else if(input.equalsIgnoreCase("yes")) {
	    	 List<Film> filmsByCinema =  filmRepository.findByNomCinema(input.toLowerCase());
	    	 if(!filmsByCinema.isEmpty()) {
	    		 String str ="Here are the films around you : " ;
		    	 for(Film film: filmsByCinema) {
		    		 str=str+"-"+film.getTitre()+" starting at "+film.getHeure_debut()+"   \n";
		    	 }
		    	 reponse.setMessage(str);
		    	 
	    	 }
	    	 else {
	    		 reponse.setMessage("There is no film available, try another date.");
	    	 }
	     }
	     else if(input.equalsIgnoreCase("no")) {
	    	 reponse.setMessage("So type when would you like to go again.");
	     }
         else if(goToCinema.contains(input.toLowerCase())) {
	    	 
	    	 reponse.setMessage("Tell me when would you like to go.");
	     }
         else if(thankyou.contains(input.toLowerCase())) {
	    	 
	    	 reponse.setMessage("It's my pleasure.");
	     }
         else if(merci.contains(input.toLowerCase())) {
	    	 
	    	 reponse.setMessage("Aurevoir.");
	     }
	     else {
	    	 if(langue.equals("fr")) {
	    		 reponse.setMessage("Désolé! Je n'ai pas compris. Pouvez-vous s'il vous plaît répéter la question?");
	    	 }
             if(langue.equals("ang")) {
            	 reponse.setMessage("Sorry! I didn't understand you. Can you please repeat your question?");
	    	 }
	    	  
	     }
		 LocalDateTime  dateTime = LocalDateTime.now();
		 reponse.setDateTime(dateTime);
		
	 
		 return reponse;
		
	}
	@GetMapping(value = "/chat/filmsAround")
	public List<Film> getFilms(@RequestParam(name = "cinema") String cinema) throws FileNotFoundException, IOException
	{		
		//Response response = new Response();
		//LocalDateTime dateTime=LocalDateTime.now();
		//response.setMessage(input);
		//response.setDateTime(dateTime);
		 
		List<Film> filmsByCinema =  filmRepository.findByNomCinema(cinema);
		/*List<Film> filmsAround=new ArrayList<Film>();;
		
		 for(Film film: filmsByCinema) {
    		 if(film.getDateProjection().equals(dateP)) {
    			 filmsAround.add(film);
    		 }
    	 }*/
		 
	 
		return filmsByCinema;
		
	}
	
}
