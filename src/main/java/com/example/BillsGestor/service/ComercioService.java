package com.example.BillsGestor.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.BillsGestor.Repository.IComercio;
import com.example.BillsGestor.model.Comercio;

@Service
public class ComercioService {

    @Autowired
    private IComercio comercioRepository;


    public Comercio guardarComercio(Comercio datosComercio){

        if (datosComercio.getEstado() == null || datosComercio.getFechaRegistro().isAfter(LocalDate.now())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Tiene una fecha incorrecta");

        }

        if (datosComercio.getNit().length() < 4){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Son muy poco caracteres para el nit");
        }

        if (datosComercio.getNombre().length() < 4){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "El nombre del comercio al parecer esta incompleto");

        }

        return comercioRepository.save(datosComercio);

    }

    public List<Comercio> listar_Comercios(){
        return comercioRepository.findAll();
    }


        //funcion para modificar un usuario
    //funcion para eliminar un usuario por id
    //funcion para buscar un usuario por id


}
