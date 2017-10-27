package br.com.caelum.livraria.webservice;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.caelum.livraria.modelo.Livro;
import br.com.caelum.livraria.service.LivroService;

@WebService
@Stateless
public class LivrariaWS {

	@Inject
	private LivroService livroService;
	
 	@WebResult(name="livro")
	public List<Livro> getLivroPorTitulo(@WebParam(name="titulo") String titulo) {

		System.out.println("Procurando pelo título:: " + titulo);

		return this.livroService.livrosPeloTitulo(titulo);
	}
}