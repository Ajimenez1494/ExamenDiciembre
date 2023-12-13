package ejercicio4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import ejercicio4.entities.Contrato;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transaction;

public class MainHibernate {
	public static void main(String[] args) {
		MainHibernate ej = new MainHibernate();
		buildEntityManagerFactory();
		//ej.insertarContratos();
		ej.mostrarContratos();
	}

	private static EntityManagerFactory buildEntityManagerFactory() {
		return Persistence.createEntityManagerFactory("hibernateMySQL");
	}

	  public void insertarContratos() {
		  EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernateMySQL");
	        EntityManager entityManager = entityManagerFactory.createEntityManager();

	        Date fechaInicio = new Date();

	        Contrato contrato1 = new Contrato(1, "Cliente1", fechaInicio, LocalDate.of(2023, 12, 31), 1000);
	        Contrato contrato2 = new Contrato(2, "Cliente2", fechaInicio, LocalDate.of(2024, 12, 31), 1500);
	        Contrato contrato3 = new Contrato(3, "Cliente3", fechaInicio, LocalDate.of(2025, 12, 31), 2000);

	        EntityTransaction transaction = entityManager.getTransaction();

	        try {
	            transaction.begin();

	            entityManager.persist(contrato1);
	            entityManager.persist(contrato2);
	            entityManager.persist(contrato3);

	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null && transaction.isActive()) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        } finally {
	            entityManager.close();
	            entityManagerFactory.close();
	        }
	    }
	  
	  public List<Contrato> mostrarContratos() {
		  EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernateMySQL");
	      EntityManager entityManager = entityManagerFactory.createEntityManager();
          try {
	           TypedQuery<Contrato> query = entityManager.createQuery("SELECT c FROM Contrato c", Contrato.class);
	            return query.getResultList();
	        } finally {
	            entityManager.close();
	            entityManagerFactory.close();
	        }
	    }		  
		
	  }
