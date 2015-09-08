package br.com.hibernate.util;

import org.hibernate.SessionFactory;

public class Main {

	public static void main(String[] args) {
		SessionFactory session = HibernateUtil.getSessionFactory();
	}
}
