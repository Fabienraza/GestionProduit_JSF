package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Marque {
	@Id
	@GeneratedValue
	private int idMarque;
	
	private String nomMarque;
	

	private Date dateCreation;
	
	
	public Marque() {

	}

	public Marque(String nomMarque, Date dateCreation) {
		this.nomMarque = nomMarque;
		this.dateCreation = dateCreation;
	}


	public int getIdMarque() {
		return idMarque;
	}


	public void setIdMarque(int idMarque) {
		this.idMarque = idMarque;
	}


	public String getNomMarque() {
		return nomMarque;
	}


	public void setNomMarque(String nomMarque) {
		this.nomMarque = nomMarque;
	}


	public Date getDateCreation() {
		return dateCreation;
	}


	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}


	@Override
	public String toString() {
		return "Marque [idMarque=" + idMarque + ", nomMarque=" + nomMarque + ", dateCreation=" + dateCreation + "]";
	}
	
	
	
	
	
	
	
}
