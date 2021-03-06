package com.daniel.domain;


import java.util.Date;

import javax.persistence.Entity;


@Entity
public class Livro extends Produto {
	
	private Integer isbn;
	private String author;
	private Date publicacaoData;
	private String title;
	
	
	public Livro(Integer id, Double preco, String detalhes, Integer isbn, String author, Date publicacaoData,
			String title) {
		super(id, preco, detalhes);
		this.isbn = isbn;
		this.author = author;
		this.publicacaoData = publicacaoData;
		this.title = title;
	}


	public Integer getIsbn() {
		return isbn;
	}


	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public Date getPublicacaoData() {
		return publicacaoData;
	}


	public void setPublicacaoData(Date publicacaoData) {
		this.publicacaoData = publicacaoData;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}
}
