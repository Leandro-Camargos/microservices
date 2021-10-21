package br.com.camargos.proxy;

import br.com.camargos.response.Cambio;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


/**
 *  'Interface' do Feign responsável por fazer a conexão com outro Microservice, facilitando bastante para não precisar fazer hardcode na controller.
 *
 */
@FeignClient(name ="cambio-service", url = "localhost:8000")
public interface CambioProxy {

	@GetMapping(value = "cambio-service/{amount}/{from}/{to}")
	public Cambio getCambio(@PathVariable("amount") Double amount, @PathVariable("from") String from, @PathVariable("to") String to);
}
