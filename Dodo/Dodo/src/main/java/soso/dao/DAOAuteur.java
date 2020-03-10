package soso.dao;

import java.util.List;

import soso.model.Auteur;

public interface DAOAuteur {
	public List<Auteur> getAllAuteur();
	public void addAuteur(Auteur auteur);
}
