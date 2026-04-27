package com.example.BillsGestor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BillsGestor.model.Categoria;
import com.example.BillsGestor.service.CategoriaService;


@RestController
@RequestMapping("/apibillsgestor/v1/categoria")
public class CategoriaController {

    @Autowired
    CategoriaService categoria;
    
    public ResponseEntity <?> controladorGuardar(@RequestBody Categoria datos){

        return ResponseEntity.status(HttpStatus.OK).body(categoria.guardarCategoria(datos));
    }

    public ResponseEntity <?> controladorListar(){
        return ResponseEntity.status(HttpStatus.OK).body(categoria.listar_Categorias());
    }
}
