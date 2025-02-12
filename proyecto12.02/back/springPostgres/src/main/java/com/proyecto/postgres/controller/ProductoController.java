package com.proyecto.postgres.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.proyecto.postgres.repository.ProductoRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ProductoController {

   @Autowired ProductoRepository productoRepository;

@GetMapping("/productos")
    public void consultar(){
    productoRepository.findAll();
        System.out.println("consultando productos en Controller");
    }

}//cierra
