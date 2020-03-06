package dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/*
 * Classe permettant la connexion avec la base de donnée
 * Nécessite l'implémentation de la dépendance Hibernate dans l'onglet "lib"
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
 * 	Recupération des fichiers de configurations pour créer une session de connexion avec la BD.
 */
	public SessionFactory getFactory() {
		if(sf == null) {
			sf = new Configuration().configure("/ressources/hibernate.cfg.xml").buildSessionFactory();
			System.out.println("session Factory créée");
		}
		return sf;
	}

	
/*
 *  creation d'une session de connexion à la BD.
 */
	public Session getSession() {
		if (s == null) {
			s = sf.openSession();
			System.out.println("session créée");
		}
		return s;
	}

					
						/*************************************************
						 * Methode getInstance() : pour établir la connexion
						 *************************************************/
	public static ConnexionDB getInstance() {
		if(instance==null) {
			instance = new ConnexionDB();
			System.out.println("Connexion établie");
		}
		return instance;
	}

	
	
	
	
	
}
