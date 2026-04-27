package com.example.BillsGestor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BillsGestor.model.Usuario;
import com.example.BillsGestor.service.UsuarioService;

@RestController
@RequestMapping("/apibillsgestor/v1/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuario;
    
    public ResponseEntity <?> controladorGuardar(@RequestBody Usuario datos){

        return ResponseEntity.status(HttpStatus.OK).body(usuario.guardarUsuario(datos));
    }

    public ResponseEntity <?> controladorListar(){
        return ResponseEntity.status(HttpStatus.OK).body(usuario.listar_Usuarios());
    }
}
