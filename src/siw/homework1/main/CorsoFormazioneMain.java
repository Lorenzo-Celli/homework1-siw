package siw.homework1.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class CorsoFormazioneMain {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("homework1-unit");
		EntityManager em = emf.createEntityManager();
		em.close();
		emf.close();
	}
	
}
