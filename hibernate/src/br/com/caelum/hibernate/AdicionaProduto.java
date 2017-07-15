package br.com.caelum.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class AdicionaProduto {
	public static void main(String[] args) {
		Produto p = new Produto();
		p.setNome("Rafael");
		p.setDescricao("Hoje � um novo dia");
		p.setPreco(100.50);
		
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.addAnnotatedClass(Produto.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
		
		System.out.println("Id do produto: " + p.getId());
		session.close();
	}
}
