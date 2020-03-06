package model;

import javax.faces.bean.ManagedBean;

import dao.IMarqueDAO;
import dao.MarqueDAO;

@ManagedBean (name="gm")
public class GestionMarque {
	
	Marque mark = new Marque();
	IMarqueDAO access = new MarqueDAO();
	
	
								/******************
								 * GETTER ET SETTER
								 ******************/
	public Marque getMark() {
		return mark;
	}
	
	public void setMark(Marque mark) {
		this.mark = mark;
	}
	
	
	
	public String ajoutMarque(Marque mark) {
		if (access.addMarque(mark) == 1)
			{
			return "access";	
			}
		return "failed";
	}
}
