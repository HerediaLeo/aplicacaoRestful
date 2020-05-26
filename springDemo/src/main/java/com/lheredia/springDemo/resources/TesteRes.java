package com.lheredia.springDemo.resources;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste") // notação utilizada para chegar nos métodos da classe.
public class TesteRes {
// resource é o que cria a url de consulta/postagem.
	
	@GetMapping("/hello")
	public ResponseEntity<?> hello(){		
		// coloca-se o status primeiro para poder retornar somente quando a requisição http estiver funcionando.
		try {
			return ResponseEntity.status(HttpStatus.OK).body("Hello world!");
		} catch (Exception e) {
			throw e;
		}		
	}
		
}
