package com.proyecto.postgres.repository;

import com.proyecto.postgres.model.Empleado;
import com.proyecto.postgres.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcEmpleadoRepository implements EmpleadoRepository {

@Autowired JdbcTemplate jdbcTemplate;

    @Override
    public int save(Empleado empleado) {
        System.out.println("insertando empleado");
    
        return jdbcTemplate.update(
            "INSERT INTO empleados (nombre,apellido,email,foto,fecha_contratacion) VALUES (?, ?)",
            empleado.getNombre(), empleado.getApellido(), empleado.getEmail(), empleado.getFoto(), empleado.getFecha_contratacion()
        );
    }

    @Override
    public List<Empleado> findAll() {
        System.out.println("consultando productos en Repository");
        return jdbcTemplate.query("select * from empleados", BeanPropertyRowMapper.newInstance(Empleado.class));
      
    }
}//cierra



