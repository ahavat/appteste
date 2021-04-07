package com.daniel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daniel.domain.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {	
}
