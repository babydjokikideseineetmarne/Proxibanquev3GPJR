package persistance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Client;

public class PersistDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");

	public void save(Client c) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {

			txn.begin();

			em.persist(c);

			txn.commit();
		}

		catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		}

		finally {
			if (em != null) {
				em.close();
			}
//			if (emf != null) {
//				emf.close();// si des pb a refaire des persistance il faut // emf.close
//			}
		}

	}

	public Client find(Long id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		Client c = new Client();
		try {

			txn.begin();
			c = em.find(Client.class, id);
			txn.commit();
		}

		catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		}

		finally {
			if (em != null) {
				em.close();
			}
//			if (emf != null) {
//				emf.close();
//			}
		}
		return c;

	}

	public void delete(String id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		Client c = new Client();
		try {

			txn.begin();

			c = em.find(Client.class, id);
			em.remove(c);

			txn.commit();
		}

		catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		}

		finally {
			if (em != null) {
				em.close();
			}
//			if (emf != null) {
//				emf.close();
//			}
		}

	}
	
	public void update(Client c) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		Client c1 = new Client();
		try {

			txn.begin();

			c1 = em.find(Client.class, c.getId());
			c1.equals(c);
			em.persist(c1);

			txn.commit();
			
			
		}

		catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		}

		finally {
			if (em != null) {
				em.close();
			}
//			if (emf != null) {
//				emf.close();
//			}
		}

	}
}
