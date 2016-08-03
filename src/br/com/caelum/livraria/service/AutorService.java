package br.com.caelum.livraria.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.caelum.livraria.dao.AutorDao;
import br.com.caelum.livraria.excecoes.LivrariaException;
import br.com.caelum.livraria.modelo.Autor;

@Stateless
public class AutorService {

	@Inject
	public AutorDao dao;

	public void adiciona(Autor autor) {
		this.dao.salva(autor);
		throw new LivrariaException();
	}

	public List<Autor> todosAutores() {
		return this.dao.todosAutores();
	}

	public Autor buscaPelaId(Integer autorId) {
		Autor autor = dao.buscaPelaId(autorId);
		return autor;
	}
}
