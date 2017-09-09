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
@Table(name="producto")
public class ProductoEntity implements Serializable{
    /**
     * llave primaria del producto
     */
    @Id
    @Column(name="id_producto", unique=true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /**
     * nombre del producto
     */
    @Column(name="nombre_producto")
    private String nombre;
    /**
     * descripción del producto
     */
    @Column(name="descripcion_producto")
    private String descripcion;
    /**
     * stock del producto
     */
    @Column(name="stock_producto")
    private String stock;
    /**
     * precio del producto
     */
    @Column(name="precio_producto")
    private Long precio;
    /**
     * marca del producto
     */
    @Column(name="marca_producto")
    private String marca;
    /**
     * garantía del producto
     */
    @Column(name="garantia_producto")
    private String garantia;
    /**
     * llave foranea del producto hacia categoría
     */
    @Column(name="id_categoria")
    private Long categoriaId;
    /**
     * llave foranea del producto hacia proveedor
     */
    @Column(name="id_proveedor")
    private Long proveedorId;
    /**
     * llave foranea del producto hacia promoción
     */
    @Column(name="id_promocion")
    private Long promocionId;
    /**
     * llave foranea del producto hacia comentarios
     */
    @Column(name="id_comentarios")
    private Long comentariosId;

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

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public Long getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Long categoriaId) {
        this.categoriaId = categoriaId;
    }

    public Long getProveedorId() {
        return proveedorId;
    }

    public void setProveedorId(Long proveedorId) {
        this.proveedorId = proveedorId;
    }

    public Long getPromocionId() {
        return promocionId;
    }

    public void setPromocionId(Long promocionId) {
        this.promocionId = promocionId;
    }

    public Long getComentariosId() {
        return comentariosId;
    }

    public void setComentariosId(Long comentariosId) {
        this.comentariosId = comentariosId;
    }
}
