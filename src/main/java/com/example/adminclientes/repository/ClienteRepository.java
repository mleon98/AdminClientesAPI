package com.example.adminclientes.repository;

import com.example.adminclientes.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;



@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    // Método para buscar clientes por nombre (búsqueda parcial)
    List<Cliente> findByNombreContainingIgnoreCase(String nombre);
}
