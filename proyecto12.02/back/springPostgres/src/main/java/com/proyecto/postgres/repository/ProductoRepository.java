package com.proyecto.postgres.repository;

import com.proyecto.postgres.model.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository {

int save(Producto producto);

    List<Producto> findAll();


}//cierra respository
