/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rojas.RRojas.repository;

import com.rojas.RRojas.entity.Producto;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author rolan
 */
public interface ProductoRepository extends CrudRepository<Producto, Long>{
    
}
