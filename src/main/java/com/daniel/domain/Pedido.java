package com.daniel.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pedido {
	
	@Id
	private Integer id;
	
	private Date dataPedido;
	private Date dataPagamento;
	private Double valorTotal;
	
	
	public Pedido() {
	}
	
	public Pedido(Date dataPedido, Date dataPagamento, Double valorTotal, Integer id) {
		super();
		this.dataPedido = dataPedido;
		this.dataPagamento = dataPagamento;
		this.valorTotal = valorTotal;
		this.id = id;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
