package main;

import java.util.Date;

import dao.IMarqueDAO;
import dao.IProduitDAO;
import dao.IUtilisateurDAO;
import dao.MarqueDAO;
import dao.ProduitDAO;
import dao.UtilisateurDAO;
import model.Marque;
import model.Produit;
import model.Utilisateur;

public class MainTest {

	public static void main(String[] args) {
//		Produit p1 = new Produit("iPhone 8", "Telephone de la marque apple", 1000);
//	IProduitDAO dao = new ProduitDAO();
		
//		dao.saveProduct(p1);

//		System.out.println(dao.getProducts());
//		Marque m1 = new Marque("apple",new Date());
//		IMarqueDAO acc = new MarqueDAO();
//		
//		acc.addMarque(m1);
		
		
//		IMarqueDAO dao = new MarqueDAO();
//		System.out.println(dao.getMarques());
		
		
		IUtilisateurDAO dao = new UtilisateurDAO();
		Utilisateur user1 = new Utilisateur("Admin", "AZERTY", "Paul", "123456");
		dao.creationCompte(user1);
		
	}

}
