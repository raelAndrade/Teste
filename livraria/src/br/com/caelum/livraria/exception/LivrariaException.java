package br.com.caelum.livraria.exception;

import javax.ejb.ApplicationException;

@ApplicationException(rollback = true) 
/*exceções unchecked irão efetuar um rollback na transação
  (System Exception no EJB Container)*/
/*exceções checked causam rollback quando configuradas via anotação com "rollback = true" 
  (Application Exception no EJB Container)*/
public class LivrariaException extends Exception {

	private static final long serialVersionUID = -5831239369770405973L;

}