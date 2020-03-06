package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.Produit;

public class ProduitDAO implements IProduitDAO {

	
/*
 * Définition de la contenue de la méthode implémentée par l'interface
 */
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

}
