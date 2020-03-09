package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.Marque;

public class MarqueDAO implements IMarqueDAO {
	
	

/********************************************************************
 * Methode permettant d'enregistrer une marque dans la base de donnée
 ********************************************************************/
	@Override
	public int addMarque(Marque m) {
		try {
			Session s = ConnexionDB.getInstance().getFactory().openSession();
			s.beginTransaction();
			s.save(m);
			s.getTransaction().commit();
			return 1;
		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("Erreur dans la methode addMarque()");
			return 0;
		}
	}
	
	

/*********************************************************************************
 * Methode permettant l'affichage des marques enregistrées dans la base de donnnée
 *********************************************************************************/
	@Override
	public List<Marque> getMarques() {
		try {
			List<Marque> tableau = new ArrayList<Marque>();

			Session s = ConnexionDB.getInstance().getFactory().openSession();
			s.beginTransaction();
			tableau = s.createQuery("from Marque").list();
			return tableau;
		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("Erreur dans la récupération de la liste des marques");
			return null;
		}
	}

}
