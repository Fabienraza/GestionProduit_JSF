package main;

import java.util.Date;

import dao.IMarqueDAO;
import dao.IProduitDAO;
import dao.MarqueDAO;
import dao.ProduitDAO;
import model.Marque;
import model.Produit;

public class MainTest {

	public static void main(String[] args) {
//		Produit p1 = new Produit("iPhone 8", "Telephone de la marque apple", 1000);
		IProduitDAO dao = new ProduitDAO();
		
//		dao.saveProduct(p1);
		System.out.println(dao.getProducts());
//		Marque m1 = new Marque("apple",new Date());
//		IMarqueDAO acc = new MarqueDAO();
//		
//		acc.addMarque(m1);
	}

}
