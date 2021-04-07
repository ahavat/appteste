package com.daniel.domain.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.domain.Pedido;
import com.daniel.domain.service.PedidoService;
import com.daniel.repository.PedidoRepository;

@RestController
@RequestMapping(value = "/Pedidos")
public class PedidoResources {
	
	@Autowired
	private PedidoRepository PedidoRepository;
	
	@Autowired
	private PedidoService service;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Pedido> find(@PathVariable Integer id) {
		Pedido obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Pedido Create(@RequestBody Pedido Pedido ) {
		return PedidoRepository.save(Pedido);
	}
}
