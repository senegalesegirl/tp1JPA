package fr.istic.tpjpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Heater {
	
	private long id;
	private String nom;
	private String modele;	
	private String marque;
	private int conso;
	
	
	
	
	@Id
	@GeneratedValue
	(strategy=GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public int getConso() {
		return conso;
	}
	public void setConso(int conso) {
		this.conso = conso;
	}
	
	
	
	
	
	
	

}
