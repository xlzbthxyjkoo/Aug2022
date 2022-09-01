package mvcTest.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import mvcTest.model.Member;
import mvcTest.model.Todo;

public class JpaMain {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			/*
			Member member = new Member();
			member.setId("sku11");
			member.setPassword("1234");
			member.setName("서경11");
			member.setEmail("sku11@sku.com");

			em.persist(member);
		
			*/
			
			
			Member member = em.find(Member.class, "sku11");
			
			member.setName("이서경");
			
			Todo todo = new Todo();
			todo.setMember(member);
			todo.setTodo("jpa study!!!");
			
			em.persist(todo);
			
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}finally {
			em.close();
		}
		
		emf.close();

	}

}
