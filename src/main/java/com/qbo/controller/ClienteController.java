package com.qbo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.qbo.model.Cliente;
import com.qbo.service.ClienteService;

@RestController
@RequestMapping("/api/v1/cliente")
public class ClienteController {
	
	@Autowired
	ClienteService clienteService;
	
	@GetMapping("")
	public ResponseEntity<List<Cliente>> obtenerClientes(){
		List<Cliente> clientes = new ArrayList<Cliente>();
		clienteService.obtenerClientes().forEach(clientes::add);
		if (clientes.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(clientes, HttpStatus.OK);
	}
	
	
	  @PostMapping("")
	  public ResponseEntity<Cliente> createTutorial(@RequestBody Cliente cliente) {
		Cliente _cliente = clienteService.guardarCliente(cliente);
	    return new ResponseEntity<>(_cliente, HttpStatus.CREATED);
	  }

}
