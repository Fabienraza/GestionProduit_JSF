package dao;

import java.util.List;

import model.Marque;

public interface IMarqueDAO {
	public int addMarque(Marque m);
	public List<Marque> getMarques();
}
