package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.Marque;

public class MarqueDAO implements IMarqueDAO {

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

}
