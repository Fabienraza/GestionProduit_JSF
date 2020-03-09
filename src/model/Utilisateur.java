package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Utilisateur {

	@Id
	private String identifiant;
	private String nom;
	private String prenom;
	private String password;
	
	
	
						/****************
						 * CONSTRUCTEURS
						 ***************/
	public Utilisateur() {

	}


	public Utilisateur(String identifiant, String nom, String prenom, String password) {
							this.identifiant = identifiant;
							this.nom = nom;
							this.prenom = prenom;
							this.password = password;
						}

	
						/******************
						 * GETTER ET SETTER
						 *****************/
	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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


	
								/*********************
								 * METHODE TO STRING()
								 ********************/
	@Override
	public String toString() {
		return "Utilisateur [identifiant=" + identifiant + ", password=" + password + "]";
	}
	
	
	
	
	
	
	
	
	
}
