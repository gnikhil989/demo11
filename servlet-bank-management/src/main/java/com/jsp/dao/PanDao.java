package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Pan;

public class PanDao {

	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("nikhil");
	EntityManager entityManager= entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction= entityManager.getTransaction();
	
	public Pan savePancardDetail(Pan pan) {
	 entityTransaction.begin();
	 entityManager.persist(pan);
	 entityTransaction.commit();
		return pan;
  

	}
	
	
}
