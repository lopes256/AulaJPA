package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import controller.PessoaController;
import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		PessoaController p = new PessoaController();
		Pessoa pFind = p.find(2);
		
//		System.out.println(p.find(2));
		
		Pessoa pj = new Pessoa(null, "Lucas O. do Nascimento", "lucas@gmail.com");
//		p.persist(pj);
		
		
		p.close();
		
		System.out.println(pFind);
		System.out.println("Pronto!!!!");
	}

}
