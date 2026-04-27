package com.example.BillsGestor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.BillsGestor.Repository.IGastoRepository;
import com.example.BillsGestor.model.Gasto;

@Service
public class GastoService {

    @Autowired
    private IGastoRepository gastoRepository;

        public Gasto guardarGasto(Gasto datosGasto){
        if(datosGasto == null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Apreciado usuario, el gasto no puede ser vacío");
        }

        if(datosGasto.getValor() == null || datosGasto.getValor() <= 500){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Apreciado usuario, el gasto debe ser superior a 500 pesos colombianos");
        }

        if(datosGasto.getDescripcion() == null || datosGasto.getDescripcion().isBlank()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Apreciado usuario, la descripción del gasto no puede estar vacía");
        }

        if(datosGasto.getFechaRegistro() == null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Apreciado usuario, la fecha de registro del gasto es obligatoria");
        }

        return gastoRepository.save(datosGasto);
    }

    public List<Gasto> listar_Gastos(){
        return gastoRepository.findAll();
    }

    public Gasto buscarGastoPorId(Integer id) {
    return gastoRepository.findById(id)
            .orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Gasto no encontrado"));
    }
}
