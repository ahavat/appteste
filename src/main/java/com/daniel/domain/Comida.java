package com.daniel.domain;

import javax.persistence.Entity;

@Entity
public class Comida extends Produto {
	
	
	private String nome;
	private String descricao;
	private String sabor;
	private String ingredientes;
	
	
	public Comida(Integer id, Double preco, String detalhes, String nome, String descricao, String sabor,
			String ingredientes) {
		super(id, preco, detalhes);
		this.nome = nome;
		this.descricao = descricao;
		this.sabor = sabor;
		this.ingredientes = ingredientes;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getSabor() {
		return sabor;
	}


	public void setSabor(String sabor) {
		this.sabor = sabor;
	}


	public String getIngredientes() {
		return ingredientes;
	}


	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
}
