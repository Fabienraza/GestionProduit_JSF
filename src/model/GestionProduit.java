package model;

import java.util.List;

import javax.faces.bean.ManagedBean;

import dao.IProduitDAO;
import dao.ProduitDAO;


/************************************************************
 * MANAGED BEAN DEDIE A L'ENREGISTREMENT D'UN NOUVEAU PRODUIT
 ***********************************************************/


/*
 * Façade qui fait appel aux structures définit dans JAVA
 * Classe qui fait le lien avec le controleur grâce à "@managedBean"
 */

@ManagedBean (name="gp")
public class GestionProduit {
	
	
	private Produit produit1 = new Produit();
	private IProduitDAO dao  = new ProduitDAO();
	

								/******************
								 * GETTER ET SETTER
								 *****************/
	public Produit getProduit1() {
		return produit1;
	}

	public void setProduit1(Produit produit1) {
		this.produit1 = produit1;
	}

						
							/*********************************
							 * METHODE POUR AJOUTER UN PRODUIT
							 *********************************/
	public String ajoutProduit() {
		if(dao.saveProduct(produit1) == 1)
			{
			return "success";		
			}
		else
			return "failed";
		
	}
	
	
	
	public List<Produit> getProduits() {
		IProduitDAO dao = new ProduitDAO();
		return dao.getProducts();
	}
}
