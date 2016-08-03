package br.com.caelum.livraria.service;

import javax.inject.Inject;

import br.com.caelum.livraria.dao.UsuarioDao;
import br.com.caelum.livraria.modelo.Usuario;

public class UsuarioService {

	@Inject
	public UsuarioDao dao;

	public Usuario buscaPeloLogin(String login) {
		Usuario usuario = dao.buscaPeloLogin(login);
		return usuario;
	}
}
