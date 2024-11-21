package com.example.adminclientes.controller;

import com.example.adminclientes.model.Cliente;
import com.example.adminclientes.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
@CrossOrigin(origins = "*")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    // Obtener todos los clientes
    @GetMapping
    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    // Obtener un cliente por ID
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getClienteById(@PathVariable Integer id) {
        return clienteRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Buscar clientes por nombre
    @GetMapping("/buscar/{nombre}")
    public List<Cliente> getClientesByNombre(@PathVariable String nombre) {
        return clienteRepository.findByNombreContainingIgnoreCase(nombre);
    }

    // Crear un nuevo cliente
    @PostMapping
    public Cliente createCliente(@RequestBody Cliente cliente) {
        cliente.setFechaRegistro(java.time.LocalDateTime.now());
        return clienteRepository.save(cliente);
    }

    // Actualizar un cliente existente
    @PutMapping("/{id}")
    public ResponseEntity<Cliente> updateCliente(@PathVariable Integer id, @RequestBody Cliente cliente) {
        return clienteRepository.findById(id)
                .map(existingCliente -> {
                    existingCliente.setNombre(cliente.getNombre());
                    existingCliente.setEmail(cliente.getEmail());
                    existingCliente.setTelefono(cliente.getTelefono());
                    existingCliente.setDireccion(cliente.getDireccion());
                    return ResponseEntity.ok(clienteRepository.save(existingCliente));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // Eliminar un cliente existente
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCliente(@PathVariable Integer id) {
        return clienteRepository.findById(id)
                .map(cliente -> {
                    clienteRepository.delete(cliente);
                    return ResponseEntity.noContent().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
