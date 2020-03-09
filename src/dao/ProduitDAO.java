package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.Marque;
import model.Produit;

public class ProduitDAO implements IProduitDAO {

	
/*********************************************************************
 * Définition de la contenue de la méthode implémentée par l'interface
 ********************************************************************/
	@Override
	public int saveProduct(Produit p) {
		try {
			SessionFactory factory = ConnexionDB.getInstance().getFactory();
			Session session = ConnexionDB.getInstance().getSession();
			session.beginTransaction();
			session.save(p);
			session.getTransaction().commit();
			System.out.println("Ajout du produit réussi");
			return 1;
		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("Erreur dans la méthode saveProduct()");
			return 0;
		}
	}
	

/****************************************************************************
 * Methode pour afficher la liste des produits présents dans la base de donnée
 *****************************************************************************/
	@Override
	public List<Produit> getProducts() {
		try {
			SessionFactory factory = ConnexionDB.getInstance().getFactory();
			Session session = ConnexionDB.getInstance().getSession();
			session.beginTransaction();
			List<Produit> list = new ArrayList<Produit>();
			list = session.createQuery("from Produit").list();
			return list;
		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("Erreur dans la recupération de la liste des produits");
			return null;
		}
	}
	

/************************************************************************************************
 * Methode pour afficher la liste des produits présent dans la base de donnée suivant leur marque
 ************************************************************************************************/

	
	
	@Override
	public List<Produit> getPoducts(Marque marque) {
		try {

			
			return null;
		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("Erreur dans la recupération de la liste des produits suivant leur marque");
			return null;
		}
	}

}
