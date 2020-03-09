package dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



							/********************************************************
							 * CLASSE PERMETTANT LA CONNEXION AVEC LA BASE DE DONNEE
							 ********************************************************/
/*
 * Classe permettant la connexion avec la base de donnée
 * Nécessite l'implémentation de la dépendance Hibernate dans l'onglet "lib"
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
 * Le constructeur définie en private pur éviter la modification vers l'extérieur
 * Nécessite la création de getter pour manipuler l'obje de l'extérieur
 */
	
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
		if(instance == null) {
			instance = new ConnexionDB();
			System.out.println("Connexion établie");
		}
		return instance;
	}

	
	
	
	
	
}
