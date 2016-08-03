package br.com.caelum.livraria.service;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.livraria.dao.LivroDao;
import br.com.caelum.livraria.modelo.Livro;

public class LivroService {

	@Inject
	public LivroDao dao;

	public void salva(Livro livro) {
		dao.salva(livro);
	}

	public List<Livro> todosLivros() {
		return dao.todosLivros();
	}
}
