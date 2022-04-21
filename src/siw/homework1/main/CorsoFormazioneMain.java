package siw.homework1.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import siw.homework1.module.Docente;
import siw.homework1.module.Indirizzo;
import siw.homework1.module.Societa;


public class CorsoFormazioneMain {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("homework1-unit");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		Societa società1 = new Societa();
		società1.setRagioneSociale("sdpifjsoidfh");
		società1.setTelefono("3231241234");
		
		Indirizzo indirizzo = new Indirizzo();
		indirizzo.setCap("00147");
		indirizzo.setNumeroCivico(22);
		indirizzo.setVia("via mario rossi");
		
		società1.setIndirizzo(indirizzo);
		
		
		
		tx.begin();
		em.persist(indirizzo);
		em.persist(società1);
		
		tx.commit();
		
		em.close();
		emf.close();
	}
	
}
