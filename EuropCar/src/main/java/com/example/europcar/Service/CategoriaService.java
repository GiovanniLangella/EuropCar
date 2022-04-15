package com.example.europcar.Service;


import com.example.europcar.Entity.Categoria;

import java.util.List;


public interface CategoriaService {
    Categoria findById(Integer id);

    List<Categoria> findAll();

    Categoria delete(Integer id);

    Categoria save(Categoria categoria);
}