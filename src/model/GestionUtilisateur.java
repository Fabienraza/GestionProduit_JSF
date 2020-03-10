package model;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import dao.IUtilisateurDAO;
import dao.UtilisateurDAO;

@ManagedBean(name="gu")
public class GestionUtilisateur {
	
	private Utilisateur user = new Utilisateur();
	private IUtilisateurDAO dao = new UtilisateurDAO();
	
	
	

							/*******************
							 * GETTER ET SETTER
							 ******************/
	public Utilisateur getUser() {
		return user;
	}
	
	public void setUser(Utilisateur user) {
		this.user = user;
	}
	
	
						
					/**************************************
					 * METHODE POUR AJOUTER UN UTILISATEUR	
					 *************************************/
	
	public String ajoutUtilisateur() {
		if(dao.creationCompte(user)==1)
			{
			return "success";
			}
		return "failed";
	}

	
	
				/*****************************************
				 * METHODE POUR AUTHENTIFIER L'UTILISATEUR
				 ****************************************/
	
	public String verifUser() {
		List<Utilisateur> list = new ArrayList<Utilisateur>();
		UtilisateurDAO dao = new UtilisateurDAO();
		list = dao.getUserList();
		
		for(int i=0 ; i<list.size() ; i++)
		{
		if(user.getIdentifiant().equals(list.get(i).getIdentifiant()) && user.getPassword().equals(list.get(i).getPassword()))
			{
			return "index";
			}
		}
		return "failed";
	}
	
	
}
