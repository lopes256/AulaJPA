package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class PessoaController {

	private Pessoa pessoa;
	private EntityManagerFactory emf;
	private EntityManager em;

	public PessoaController() {
		super();
//		this.pessoa = new Pessoa();
		this.emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		this.em = emf.createEntityManager();
	}

	public Pessoa find(Integer codigo) {
		return em.find(Pessoa.class, codigo);
	}

	public void persist(Pessoa p) {
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
	}
	
	public void remove(Integer codigo) {
		this.pessoa = em.find(Pessoa.class, codigo);
		em.getTransaction().begin();
		em.remove(this.pessoa);
		em.getTransaction().commit();
	}
	
	public void merge(Pessoa p) {
		em.getTransaction().begin();
		em.merge(p);
		em.getTransaction().commit();
	}

	public void close() {
		em.close();
		emf.close();
	}
}
