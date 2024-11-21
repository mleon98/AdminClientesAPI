package com.example.adminclientes.repository;

import com.example.adminclientes.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    // Método para buscar un usuario por su nombre de usuario
    Usuario findByUsername(String username);
}
