package br.com.caelum.livraria.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.caelum.livraria.dao.UsuarioDao;
import br.com.caelum.livraria.modelo.Usuario;

@Stateless
public class UsuarioService {

	@Inject
	private UsuarioDao dao;

	public Usuario buscaPeloLogin(String login) {
		return this.dao.buscaPeloLogin(login);
	}
}
