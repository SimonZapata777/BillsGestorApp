package com.example.BillsGestor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BillsGestor.model.Comercio;
import com.example.BillsGestor.service.ComercioService;



@RestController
@RequestMapping
public class ComercioCotroller {

    @Autowired
    ComercioService comercio;

    public ResponseEntity <?> controladorGuardar(@RequestBody Comercio datos){
        return ResponseEntity.status(HttpStatus.OK).body(comercio.guardarComercio(datos));
    }

    public ResponseEntity <?> controladorListar(){
        return ResponseEntity.status(HttpStatus.OK).body(comercio.listar_Comercios());
    }
}
