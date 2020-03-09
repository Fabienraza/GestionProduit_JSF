package dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



							/********************************************************
							 * CLASSE PERMETTANT LA CONNEXION AVEC LA BASE DE DONNEE
							 ********************************************************/
/*
 * Classe permettant la connexion avec la base de donn�e
 * N�cessite l'impl�mentation de la d�pendance Hibernate dans l'onglet "lib"
 * Utilise le design pattern "singleton" pour eviter la creation de plusieurs objet connexion dans le programme
 */

public class ConnexionDB {
	
	private SessionFactory sf = null;
	private Session s = null;
	private static ConnexionDB instance = null;
	
	
								/**************
								 *Constructeur 
								 **************/
/*
 * Le constructeur d�finie en private pur �viter la modification vers l'ext�rieur
 * N�cessite la cr�ation de getter pour manipuler l'obje de l'ext�rieur
 */
	
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
		if(instance == null) {
			instance = new ConnexionDB();
			System.out.println("Connexion �tablie");
		}
		return instance;
	}

	
	
	
	
	
}
