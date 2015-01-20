package fr.istic.tpjpa.jpa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.istic.tpjpa.domain.Person;

public class JpaTest {

	private EntityManager manager;

	public JpaTest(EntityManager manager) {
		this.manager = manager;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("example");
		EntityManager manager = factory.createEntityManager();
		JpaTest test = new JpaTest(manager);

		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		try{
		// TODO create entity
		test.createPerson();
		}
		catch(Exception e){
			e.printStackTrace();
		}

		// TODO persist entity

		tx.commit();
		
		test.afficherPerson();

		// TODO run request

		System.out.println(".. done");
	}

	private void afficherPerson() {
		List<Person> listeperson=manager.createQuery("Select p from Person p",Person.class).getResultList();
		System.out.println("Identifiant:" +listeperson.size());
		for(Person next:listeperson){
			System.out.println("la personne: "+next);
		}
	}

	private void createPerson() {
		int numOfPerson=manager.createQuery("Select p from Person p",Person.class).getResultList().size();
		if(numOfPerson==0){
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");			
			Date d;
			try {
				d = formatter.parse("03/01/1988");
				manager.persist(new Person("Sy","Oumoul","Feminin","oumoulousmane@gmail.com","online",d));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}
	
	
	
	
	

}
