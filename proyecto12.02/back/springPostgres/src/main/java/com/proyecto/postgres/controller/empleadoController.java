package com.proyecto.postgres.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.postgres.model.Empleado;
import com.proyecto.postgres.repository.EmpleadoRepository;
import com.proyecto.postgres.repository.ProductoRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class empleadoController {

   @Autowired EmpleadoRepository empleadoRepository;

@GetMapping("/empleado")
public List <Empleado> consultar() {
    System.out.println("consultando empleados en Controller");
    return empleadoRepository.findAll();
}

}//cierra
