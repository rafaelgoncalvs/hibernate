package br.com.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.Test;

import br.com.hibernate.dominio.EntidadeTest;

public class HibernateUtilTest {

	@Test
	public void deve_criar_uma_session_factory() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Assert.assertNotNull(sessionFactory);
	}
	
	@Test
	public void deve_retornar_a_current_session() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		Assert.assertNotNull(session);
	}
	
	@Test
	public void deve_persistir_uma_entidade() {
		EntidadeTest entidadeTest = new EntidadeTest();
		SessionFactory sessioonFactory = HibernateUtil.getSessionFactory();
		Session session = sessioonFactory.getCurrentSession();
		
		session.beginTransaction();
		session.persist(entidadeTest);
		session.getTransaction().commit();
		
		Assert.assertNotNull(entidadeTest.getId());
	}
}
