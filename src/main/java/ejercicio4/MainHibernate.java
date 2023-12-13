package ejercicio4;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import ejercicio4.entities.Contrato;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainHibernate {
	private  SessionFactory sessionFactory;
	public static void main(String[] args) {
		buildEntityManagerFactory();
	}

	private static EntityManagerFactory buildEntityManagerFactory() {
		return Persistence.createEntityManagerFactory("hibernateMySQL");
	}

	  public void insertarContratos() {
		
	        }
	    
}