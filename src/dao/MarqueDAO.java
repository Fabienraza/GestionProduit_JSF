package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.Marque;

public class MarqueDAO implements IMarqueDAO {
	
	

/********************************************************************
 * Methode permettant d'enregistrer une marque dans la base de donn�e
 ********************************************************************/
	@Override
	public int addMarque(Marque m) {
		try {
			SessionFactory factory = ConnexionDB.getInstance().getFactory();
			Session s = ConnexionDB.getInstance().getSession();
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
 * Methode permettant l'affichage des marques enregistr�es dans la base de donnn�e
 *********************************************************************************/
	@Override
	public List<Marque> getMarques() {
		// TODO Auto-generated method stub
		return null;
	}

}
