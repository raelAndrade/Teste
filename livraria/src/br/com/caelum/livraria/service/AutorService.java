package br.com.caelum.livraria.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;

import br.com.caelum.livraria.dao.AutorDao;
import br.com.caelum.livraria.modelo.Autor;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class AutorService {

	@Inject
	private AutorDao dao;

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
 	public void salva(Autor autor){
		this.dao.salva(autor);
//		throw new LivrariaException();
 	}
 	
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<Autor> todosAutores() {
		return this.dao.todosAutores();
	}

	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public Autor buscaPelaId(final Integer autorId) {
		return this.dao.buscaPelaId(autorId);
	}
}