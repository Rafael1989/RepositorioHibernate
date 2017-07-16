package br.com.caelum.hibernate;

import org.hibernate.Session;

import br.com.caelum.hibernate.dao.ProdutoDAO;

public class TestaBuscas {

	public static void main(String[] args) {
		Session session = new HibernateUtil().getSession();
		ProdutoDAO produtoDAO = new ProdutoDAO(session);
		
		System.out.println("*****Listando Tudo*******");
		for(Produto p : produtoDAO.pagina(0, 3)){
			System.out.println(p.getNome());
		}
		
		System.out.println("*****Preços maiores que*******");
		for(Produto p : produtoDAO.precoMaiorQue(2.10)){
			System.out.println(p.getNome());
		}
	}
}
