package com.example.BillsGestor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BillsGestor.model.Gasto;
import com.example.BillsGestor.service.GastoService;

@RestController
@RequestMapping("/apibillsgestor/v1/gasto")
public class GastoController {

    @Autowired
    GastoService gasto;
    
    public ResponseEntity <?> controladorGuardar(@RequestBody Gasto datos){
        return ResponseEntity.status(HttpStatus.OK).body(gasto.guardarGasto(datos));
    }

    public ResponseEntity <?> controladorListar(){
        return ResponseEntity.status(HttpStatus.OK).body(gasto.listar_Gastos());
    }
}
