package com.grupo5.retog5v11.controlador;

import com.grupo5.retog5v11.entidad.Category;
import com.grupo5.retog5v11.servicio.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/Category")
public class ApiCategory {

    @Autowired
    private CategoryService service;

    @GetMapping("/all")
    public List<Category>  getCategories(){
        return service.getCategories();
    }

    @PostMapping("/save")
    public ResponseEntity saveCategory(@RequestBody Category category) {
        service.saveCategory(category);
        return ResponseEntity.status(201).build();
    }
}
