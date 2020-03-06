package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.Produit;

public class ProduitDAO implements IProduitDAO {

	
/*
 * D�finition de la contenue de la m�thode impl�ment�e par l'interface
 */
	@Override
	public int saveProduct(Produit p) {
		try {
			SessionFactory factory = ConnexionDB.getInstance().getFactory();
			Session session = ConnexionDB.getInstance().getSession();
			session.beginTransaction();
			session.save(p);
			session.getTransaction().commit();
			System.out.println("Ajout du produit r�ussi");
			return 1;
		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("Erreur dans la m�thode saveProduct()");
			return 0;
		}
	}

}
