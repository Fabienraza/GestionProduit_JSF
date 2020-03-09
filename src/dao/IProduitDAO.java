package dao;

import java.util.List;

import model.Marque;
import model.Produit;

public interface IProduitDAO {
	public int saveProduct(Produit p);
	public List<Produit> getProducts();
	//public List<Produit> getPoducts(Marque marque);
}
