package br.com.caelum.livraria.excecoes;

import javax.ejb.ApplicationException;

@ApplicationException(rollback = true)
public class LivrariaException extends RuntimeException {

}
