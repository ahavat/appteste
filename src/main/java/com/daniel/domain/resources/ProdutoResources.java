package com.daniel.domain.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.domain.Produto;
import com.daniel.domain.service.ProdutoService;
import com.daniel.repository.ProdutoRepository;

@RestController
@RequestMapping(value = "/Produtos")
public class ProdutoResources {
	
	@Autowired
	private ProdutoRepository ProdutoRepository;
	
	@Autowired
	private ProdutoService service;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Produto> find(@PathVariable Integer id) {
		Produto obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Produto Create(@RequestBody Produto Produto ) {
		return ProdutoRepository.save(Produto);
	}
}
