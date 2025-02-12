package com.proyecto.postgres.repository;

import com.proyecto.postgres.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcProductoRepository implements ProductoRepository {

@Autowired JdbcTemplate jdbcTemplate;

    @Override
    public int save(Producto producto) {
        System.out.println("insertando producto");
        return 0;
    }

    @Override
    public List<Producto> findAll() {
        System.out.println("consultando productos en Repository");
        return jdbcTemplate.query("select * from productos", BeanPropertyRowMapper.newInstance(Producto.class));
        // return jdbcTemplate.query(q, BeanPropertyRowMapper.newInstance(Tutorial.class));
    }
}//cierra



