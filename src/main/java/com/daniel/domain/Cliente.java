package com.daniel.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String primeiroNome;
	private String nomeDoMeio;
	private String sobrenome;
	private Integer telefone;
	private String email;
	
	public Cliente() {
	}
	
	public Cliente(Integer id, String primeiroNome, String nomeDoMeio, String sobrenome, Integer telefone,
			String email) {
		super();
		this.id = id;
		this.primeiroNome = primeiroNome;
		this.nomeDoMeio = nomeDoMeio;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
		this.email = email;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	public String getNomeDoMeio() {
		return nomeDoMeio;
	}
	public void setNomeDoMeio(String nomeDoMeio) {
		this.nomeDoMeio = nomeDoMeio;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public Integer getTelefone() {
		return telefone;
	}
	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
