package br.com.caelum.livraria.interceptador;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class LogInterceptador {

	@AroundInvoke
	public Object intercepta(InvocationContext contexto) throws Exception {

		long millis = System.currentTimeMillis();

		Object objeto = contexto.proceed();

		String metodo = contexto.getMethod().getName();
		String classe = contexto.getTarget().getClass().getName();

		System.out.println(metodo + ", " + classe);
		System.out.println("Tempo gasto: " + (System.currentTimeMillis() - millis));

		return objeto;
	}
}
