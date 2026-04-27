package com.example.BillsGestor.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BillsGestor.model.Comercio;


public interface IComercio extends JpaRepository<Comercio, Integer> {

   List<Comercio> findByNit(String nit);

   List<Comercio> findByRegimenTributario(String regimenTributario);

}
