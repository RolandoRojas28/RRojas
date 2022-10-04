/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rojas.RRojas.controller;

import com.rojas.RRojas.entity.Categoria;
import com.rojas.RRojas.service.CategoriaService;
import io.swagger.annotations.Api;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author rolan
 */
@RestController
@RequestMapping("/categoria")
@Api(value = "Microservicios de gestion de categoria", description ="Microservicio de Categoria")
public class CategoriaController {

@Autowired
    private CategoriaService categoriaService;

    @GetMapping("/all")
    public List<Categoria> findAll() {
        return categoriaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categoria> findById(@PathVariable Long id) {
        Categoria categoria = categoriaService.findById(id);
        return ResponseEntity.ok(categoria);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        categoriaService.deleteById(id);
    }

    @PostMapping("/save")
    public Categoria save(@RequestBody Categoria categoria) {
        return categoriaService.save(categoria);
    }

    @PutMapping("/update")
    public Categoria update(@RequestBody Categoria categoria) {
        return categoriaService.save(categoria);
    }
    
}
