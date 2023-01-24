package model;

import java.io.Serializable;

public class PostBean implements Serializable {
	private int id;
	private String age;
	private String gender;
	private String prefId;
	private String vaccineCount;
	private String infectionRoute;
	private String recuperationForm;
	private String recuperationDays;
	private String situation;
	private String contactperson;
	private String symptoms;
	private String service;
	private String tocure;
	private String other;
	
	public PostBean() {}
	public PostBean(String age, String gender, String prefId, String vaccineCount, String infectionRoute, String recuperationForm, String recuperationDays, String situation, String contactperson, String symptoms, String service, String tocure, String other) {
		this.age = age;
		this.gender = gender;
		this.prefId = prefId;
		this.vaccineCount = vaccineCount;
		this.infectionRoute = infectionRoute;
		this.recuperationForm = recuperationForm;
		this.recuperationDays = recuperationDays;
		this.situation = situation;
		this.contactperson = contactperson;
		this.symptoms = symptoms;
		this.service = service;
		this.tocure = tocure;
		this.other = other;
	}
	
	public PostBean(int id, String age, String gender, String prefId, String vaccineCount, String infectionRoute, String recuperationForm, String recuperationDays, String situation, String contactperson, String symptoms, String service, String tocure, String other) {
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.prefId = prefId;
		this.vaccineCount = vaccineCount;
		this.infectionRoute = infectionRoute;
		this.recuperationForm = recuperationForm;
		this.recuperationDays = recuperationDays;
		this.situation = situation;
		this.contactperson = contactperson;
		this.symptoms = symptoms;
		this.service = service;
		this.tocure = tocure;
		this.other = other;
	}
	
	public int getId() { return id; }
	public void setId(int id) { this.id = id; }
	public String getAge() { return age; }
	public void setAge(String age) { this.age = age; }
	public String getGender() { return gender; }
	public void setGender(String gender) { this.gender = gender; }
	public String getPrefId() { return prefId; }
	public void setPrefId(String prefId) { this.prefId = prefId; }
	public String getVaccineCount() { return vaccineCount; }
	public void setVaccineCount(String vaccineCount) { this.vaccineCount = vaccineCount; }
	public String getInfectionRoute() { return infectionRoute; }
	public void setInfectionRoute(String infectionRoute) { this.infectionRoute = infectionRoute; }
	public String getRecuperationForm() { return recuperationForm; }
	public void setRecuperationForm(String recuperationForm) { this.recuperationForm = recuperationForm; }
	public String getRecuperationDays() { return recuperationDays; }
	public void setRecuperationDays(String recuperationDays) { this.recuperationDays = recuperationDays; }
	public String getSituation() {return situation;}
	public void setSituation(String situation) {this.situation = situation;}
	public String getContactperson() {return contactperson;}
	public void setContactperson(String contactperson) {this.contactperson = contactperson;}
	public String getSymptoms() {return symptoms;}
	public void setSymptoms(String symptoms) {this.symptoms = symptoms;}
	public String getService() {return service;}
	public void setService(String service) {this.service = service;}
	public String getTocure() {return tocure;}
	public void setTocure(String tocure) {this.tocure = tocure;}
	public String getOther() {return other;}
	public void setOther(String other) {this.other = other;}
}
