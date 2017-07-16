package br.com.caelum.hibernate;

import org.hibernate.Session;

import br.com.caelum.hibernate.dao.ProdutoDAO;

public class TestaProdutoDAO {

	public static void main(String[] args) {
		Session session = new HibernateUtil().getSession();
		
		ProdutoDAO dao = new ProdutoDAO(session);
		Produto produto = new Produto();
		produto.setDescricao("chocolate");
		produto.setNome("hersheys");
		produto.setPreco(3.50);
		
		session.beginTransaction();
		dao.salva(produto);
		session.getTransaction().commit();
		
		session.close();
	}
}
