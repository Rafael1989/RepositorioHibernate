package br.com.caelum.hibernate;

import org.hibernate.Session;

public class TestaBusca {

	public static void main(String[] args) {
		Session session = new HibernateUtil().getSession();
		Produto encontrado = (Produto) session.load(Produto.class, 1L);
		System.out.println("O select já foi feito");
		System.out.println(encontrado.getNome());
		System.out.println(encontrado.getClass().getName());
	}
}
