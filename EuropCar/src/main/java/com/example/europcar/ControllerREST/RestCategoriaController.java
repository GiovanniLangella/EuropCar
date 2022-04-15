package com.example.europcar.ControllerREST;

import com.example.europcar.Entity.Categoria;
import com.example.europcar.Service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categoria")
public class RestCategoriaController {

    @Autowired
    CategoriaService CategoriaService;

    @GetMapping(value = "/{id}")
    public Categoria getById(@PathVariable("id") Integer id) {
        return CategoriaService.findById(id);
    }

    @GetMapping(value = "/lista")
    public List<Categoria> getAll() {
        return CategoriaService.findAll();
    }

    @PostMapping(value = "/newCategoria")
    public void newCategoria(@RequestBody Categoria categoria) {
        CategoriaService.save(categoria);
    }

    @DeleteMapping(value = "/deleteCategoria/{id}")
    public void deleteCategoriaPerId(@PathVariable("id") Integer id) {
        CategoriaService.delete(id);
    }

}