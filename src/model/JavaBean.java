package model;

import javax.faces.bean.ManagedBean;

/*
 *  @ManagedBean: Pour indiquer que la classe est gérée par le controleur de JSF
 *  
 */

@ManagedBean (name="Maclasse")	
public class JavaBean {
	private String message = "Bienvenue sur la page d'accueil de E-Commerce";

	
								/*******************
								 * Getter et Setter
								 *******************/
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
