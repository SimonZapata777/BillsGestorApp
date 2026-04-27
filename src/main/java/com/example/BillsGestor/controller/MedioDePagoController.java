package com.example.BillsGestor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BillsGestor.model.MedioDePago;
import com.example.BillsGestor.service.MedioDePagoService;

@RestController
@RequestMapping("/apibillsgestor/v1/medioDePago")
public class MedioDePagoController {

    @Autowired
    MedioDePagoService medioDePago;

    public ResponseEntity <?> controladorGuardar(@RequestBody MedioDePago datos){
        return ResponseEntity.status(HttpStatus.OK).body(medioDePago.guardarMedioDePago(datos));
    }

    public ResponseEntity <?> controladorListar(){
        return ResponseEntity.status(HttpStatus.OK).body(medioDePago.listar_MedioDePago());
    }

}
