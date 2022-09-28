package com.grupo5.retog5v11.servicio;


import com.grupo5.retog5v11.entidad.Category;
import com.grupo5.retog5v11.repositorio.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    //peticion GET
    public List<Category> getCategories() {
        return repository.findAll();
    }

    //peticion POST
    public Category saveCategory(Category category) {
        return repository.save(category);
    }

}