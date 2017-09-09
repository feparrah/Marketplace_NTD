/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.konrad.project1.ntd.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author PC
 */
@Entity
@Table(name="promocion")
public class PromocionEntity implements Serializable{
    /**
     * llave primaria de la promoción
     */
    @Id
    @Column(name="id_promocion", unique=true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /**
     * nombre de la promoción
     */
    @Column(name="nombre_promocion")
    private String nombre;
    /**
     * descripción de la promoción
     */
    @Column(name="descripcion_promocion")
    private String descripcion;
    /**
     * descuento de la promoción
     */
    @Column(name="descuento_promocion")
    private Long descuento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getDescuento() {
        return descuento;
    }

    public void setDescuento(Long descuento) {
        this.descuento = descuento;
    }
}
