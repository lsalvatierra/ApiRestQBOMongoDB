package com.qbo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qbo.model.Cliente;
import com.qbo.repository.ClienteRepository;
@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository clienteRepository;

	public Cliente guardarCliente(Cliente objcliente) {
		return clienteRepository.save(objcliente);
	}
	
	public List<Cliente> obtenerClientes(){
		return clienteRepository.findAll();
	}
	
}
