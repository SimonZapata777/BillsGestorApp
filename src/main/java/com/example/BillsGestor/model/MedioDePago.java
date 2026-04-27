package com.example.BillsGestor.model;

import com.example.BillsGestor.model.utils.TipoDeFranquicia;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="medio_de_pago")
public class MedioDePago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombres_completos", nullable = false, unique = false, length = 100)
    private String nombre;
    @Column(name = "nombres_completos", nullable = false, unique = false, length = 30)
    @Enumerated(EnumType.STRING)
    private TipoDeFranquicia franquicia;
    @Column(name = "nombres_completos", nullable = false, unique = false)
    private Boolean estado;
   
   
    public MedioDePago() {
    }
   
   
    public MedioDePago(Integer id, String nombre, TipoDeFranquicia franquicia, Boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.franquicia = franquicia;
        this.estado = estado;
    }
    public Integer getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public TipoDeFranquicia getFranquicia() {
        return franquicia;
    }
    public Boolean getEstado() {
        return estado;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setFranquicia(TipoDeFranquicia franquicia) {
        this.franquicia = franquicia;
    }
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    

    
}
