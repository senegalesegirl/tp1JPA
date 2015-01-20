package fr.istic.tpjpa.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Home {
	
	private int id;
	
	private String adresse;
	
	private int superficie;
	
	private String ip;
	
	private List<Heater> heaters;
	
	
	private List<ElecDevice> devices;

	
	@Id
	@GeneratedValue
	(strategy=GenerationType.SEQUENCE)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
	
	@OneToMany
	public List<Heater> getHeaters() {
		return heaters;
	}

	public void setHeaters(List<Heater> heaters) {
		this.heaters = heaters;
	}
	@OneToMany
	public List<ElecDevice> getDevices() {
		return devices;
	}

	public void setDevices(List<ElecDevice> devices) {
		this.devices = devices;
	}
	
	

}
