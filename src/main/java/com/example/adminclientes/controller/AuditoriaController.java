package com.example.adminclientes.controller;

import com.example.adminclientes.model.Auditoria;
import com.example.adminclientes.repository.AuditoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auditoria")
@CrossOrigin(origins = "*")
public class AuditoriaController {

    @Autowired
    private AuditoriaRepository auditoriaRepository;

    // Obtener todas las entradas de auditoría
    @GetMapping
    public List<Auditoria> getAllAuditoria() {
        return auditoriaRepository.findAll();
    }

    // Crear una entrada de auditoría
    @PostMapping
    public Auditoria createAuditoria(@RequestBody Auditoria auditoria) {
        auditoria.setFecha(java.time.LocalDateTime.now());
        return auditoriaRepository.save(auditoria);
    }
}
