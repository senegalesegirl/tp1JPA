package fr.istic.tpjpa.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Person {
	
	private int ident;
	
	private String nom;
	 
	private String  prenom;
	
	private String genre;
	 
	private String mail;
	 
	private String profil;
	
	private java.util.Date date;
	
	
	private List<Person> friends= new ArrayList<Person>();
	
	//on met la liste dans la classe qui a une cardinalité de 1
	
	private List<Home> homes= new ArrayList<Home>();

	
	/*
	 * Les constructeurs
	 */
	
	 public Person(){
		 
	 }
	
	
 public Person(String n, String p, String g, String m, String pr, Date date){
	 this.nom=n;
	 this.prenom=p;
	 this.genre=g;
	 this.mail=m;
	 this.profil=pr;
	 this.date=date;
		 
	 }
	
	
	
	/*
	 * Pour respecter la convention JavaBeans on a généré les getteurs et les setteurs de la classe et on y a mis les annotations comme conseillé dans le cours.
	 */
	@Id
	@GeneratedValue
	(strategy=GenerationType.AUTO)
	public int getIdent() {
		return ident;
	}
//on ne met pas les generatedvalu autoincrémente ici car cette fonction est vue sous l'angle de l'aacés direct à un tuple de la table.
	public void setIdent(int ident) {
		this.ident = ident;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getProfil() {
		return profil;
	}

	public void setProfil(String profil) {
		this.profil = profil;
	}

	@OneToMany
	public List<Person> getFriends() {
		return friends;
	}

	public void setFriends(List<Person> friends) {
		this.friends = friends;
	}

	@OneToMany
	public List<Home> getHomes() {
		return homes;
	}

	public void setHomes(List<Home> homes) {
		this.homes = homes;
	}

	@Temporal(TemporalType.DATE)
	public java.util.Date getDate() {
		return date;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

}
