package dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/*
 * Classe permettant la connexion avec la base de donn�e
 * N�cessite l'impl�mentation de la d�pendance Hibernate dans l'onglet "lib"
 */

public class ConnexionDB {
	
								/***************
								 * Les attributs
								 ***************/
	private SessionFactory sf = null;
	private Session s = null;
	private static ConnexionDB instance = null;
	
	
								/**************
								 *Constructeur 
								 **************/
	private ConnexionDB() {
	}
	
	

									/********
									 * Getter
									 ********/
/*
 * 	Recup�ration des fichiers de configurations pour cr�er une session de connexion avec la BD.
 */
	public SessionFactory getFactory() {
		if(sf == null) {
			sf = new Configuration().configure("/ressources/hibernate.cfg.xml").buildSessionFactory();
			System.out.println("session Factory cr��e");
		}
		return sf;
	}

	
/*
 *  creation d'une session de connexion � la BD.
 */
	public Session getSession() {
		if (s == null) {
			s = sf.openSession();
			System.out.println("session cr��e");
		}
		return s;
	}

					
						/*************************************************
						 * Methode getInstance() : pour �tablir la connexion
						 *************************************************/
	public static ConnexionDB getInstance() {
		if(instance==null) {
			instance = new ConnexionDB();
			System.out.println("Connexion �tablie");
		}
		return instance;
	}

	
	
	
	
	
}
