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
 * D�finition de la contenue de la m�thode impl�ment�e par l'interface
 ********************************************************************/
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
	

/****************************************************************************
 * Methode pour afficher la liste des produits pr�sents dans la base de donn�e
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
			System.out.println("Erreur dans la recup�ration de la liste des produits");
			return null;
		}
	}
	

/************************************************************************************************
 * Methode pour afficher la liste des produits pr�sent dans la base de donn�e suivant leur marque
 ************************************************************************************************/

	
	
	@Override
	public List<Produit> getPoducts(Marque marque) {
		try {

			
			return null;
		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("Erreur dans la recup�ration de la liste des produits suivant leur marque");
			return null;
		}
	}

}
