package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Produit {
	
							/****************
							 * LES ATTRIBUTS
							 ****************/
	@Id
	@GeneratedValue
	private int idProduit;
	private String nomProduit;
	private String descProduit;
	private double prixProduit;
	
	
	@ManyToOne
	@JoinColumn (name="idMarque")
	private Marque marque;

	
	
							/****************
							 * CONSTRUCTEURS
							 ****************/
	public Produit() {

	}
	
	public Produit(int idProduit, String nomProduit, String descProduit, double prixProduit) {
		super();
		this.idProduit = idProduit;
		this.nomProduit = nomProduit;
		this.descProduit = descProduit;
		this.prixProduit = prixProduit;
	}

	public Produit(String nomProduit, String descProduit, double prixProduit) {
		super();
		this.nomProduit = nomProduit;
		this.descProduit = descProduit;
		this.prixProduit = prixProduit;
	}

	
								
								/******************
								 * GETTER ET SETTER
								 *****************/
	public int getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}

	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	public String getDescProduit() {
		return descProduit;
	}

	public void setDescProduit(String descProduit) {
		this.descProduit = descProduit;
	}

	public double getPrixProduit() {
		return prixProduit;
	}

	public void setPrixProduit(double prixProduit) {
		this.prixProduit = prixProduit;
	}

	
	
								/*********************
								 * METHODE TO STRING()
								 ********************/
	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", nomProduit=" + nomProduit + ", descProduit=" + descProduit
				+ ", prixProduit=" + prixProduit + "]";
	}
	
	
	
	
}
