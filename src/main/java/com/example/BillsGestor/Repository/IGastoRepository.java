package com.example.BillsGestor.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BillsGestor.model.Gasto;

public interface IGastoRepository extends JpaRepository<Gasto, Integer> {

    List<Gasto> findByValor(Double valor);
    
    List<Gasto> findByFecha(LocalDate fecha);

}
