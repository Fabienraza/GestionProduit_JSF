package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import model.Produit;
import model.Utilisateur;

public class UtilisateurDAO implements IUtilisateurDAO{

	
	
						/*********************************************
						 * Methode pour ajouter un nouveau utilisateur
						 *********************************************/
	@Override
	public int creationCompte(Utilisateur user) {
		try {
			Session s = ConnexionDB.getInstance().getFactory().openSession();
			s.beginTransaction();
			s.save(user);
			s.getTransaction().commit();
			System.out.println("Compte créé");
			return 1;
		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("Erreur dans la creation de votre compte");
			return 0;
		}
	}
	
	
	/*************************************************************************
	 * Methode pour retourner la liste des utilisateurs dans la base de donnée
	 *************************************************************************/
	public List<Utilisateur> getUserList() {
		List<Utilisateur>liste = new ArrayList<Utilisateur>();
		
		try {
			Session s = ConnexionDB.getInstance().getFactory().openSession();
			s.beginTransaction();
			liste = s.createQuery("from Utilisateur").list();
			return liste;
		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("Erreur dans la récupération de la liste des utilisateurs");
			return null;
		}
	}
	
}
