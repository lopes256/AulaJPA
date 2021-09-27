package aplicacao;

import controller.PessoaController;
import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		PessoaController p = new PessoaController();

		Pessoa pj = new Pessoa(3, "Cecilia Gomes do Nascimento", "cecilia@gmail.com");
		p.merge(pj);

		Pessoa pFind = p.find(3);

		p.close();

		System.out.println(pFind);
		System.out.println("Pronto!!!!");
	}

}
