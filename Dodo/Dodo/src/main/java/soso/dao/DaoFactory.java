package soso.dao;

import soso.dao.DAOArticle;
import soso.dao.DAOArticleImpl;
import soso.dao.MySQLManager;

public class DaoFactory {
	private MySQLManager manager;
	private DAOArticle daoArticle;
	private DAOAuteur daoAuteur;
	
	public DaoFactory() {
		manager = MySQLManager.getInstance();
		daoArticle = new DAOArticleImpl(manager.getConnection());
		daoAuteur = new DAOauteurImpl(manager.getConnection());
	}
	
	public DAOArticle getDaoArticle() {
		return daoArticle;
	}
	public DAOAuteur getDaoAuteur() {
		return daoAuteur;
	}
	

}
