package model;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import dao.IMarqueDAO;
import dao.MarqueDAO;


/*
 * MANAGED BEAN DEDIE A L'ENREGISTREMENT D'UNE NOUVELLE MARQUE 
 */

@ManagedBean (name="gm")
public class GestionMarque {
	
	Marque marque = new Marque();
	IMarqueDAO access = new MarqueDAO();
	
	
								/******************
								 * GETTER ET SETTER
								 ******************/
	public Marque getmarque() {
		return marque;
	}
	
	public void setmarque(Marque marque) {
		this.marque = marque;
	}
	
	
						/**********************************************************
						 * METHODE POUR AJOUTER UNE MARQUE DANS LA BASE DE DONNEE
						 *********************************************************/
	public String ajoutMarque() {
		if (access.addMarque(marque) == 1)
			{
			return "success";	
			}
		return "failed";
	}
	
	
	
					/*******************************************************************
					 * METHODE POUR AFFICHER LA LISTE DES MARQUES DANS LA BASE DE DONNEE
					 ******************************************************************/
	public List<Marque> afficheMarques() {
		IMarqueDAO dao = new MarqueDAO();
		return dao.getMarques();
	}
	
	
}
