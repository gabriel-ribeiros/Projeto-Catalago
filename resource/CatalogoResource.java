package com.example.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Cliente;

@RestController
@RequestMapping(value="/catalogo")
public class CatalogoResource 
{
	@GetMapping
	public ResponseEntity<Cliente> obter()
	{		
		Cliente cl1 = new Cliente(1, "Gabriel", "967.141.100-22");		
		return ResponseEntity.ok().body(cl1);
	}
}

