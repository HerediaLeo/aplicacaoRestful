package com.lheredia.springDemo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lheredia.springDemo.model.Cliente;
import com.lheredia.springDemo.repository.ClienteRepo;

@RestController
@RequestMapping("/cliente")
public class ClienteRes {

	
	@Autowired
	ClienteRepo repo;
	
	@RequestMapping("/findAll")
	public ResponseEntity<?> findAll(){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(repo.findAll());
		} catch (Exception e) {
			throw e;
		}
	}
	
	@RequestMapping("/findById/{id}")
	// notation path variable é para informar que o parametro vem pelo caminho.
	public ResponseEntity<?> findById(@PathVariable Long id){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(repo.findById(id));
		} catch (Exception e) {
			throw e;
		}
	}
	
	@PostMapping("/saveCliente")
	public Cliente save(@RequestBody Cliente c) {
		try {										
			return repo.save(c);
		} catch (Exception e) {
			throw e;
		}	
	}
	
}
