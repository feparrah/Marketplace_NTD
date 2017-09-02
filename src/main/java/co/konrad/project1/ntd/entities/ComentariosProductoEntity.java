/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.konrad.project1.ntd.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author PC
 */
@Entity
public class ComentariosProductoEntity implements Serializable{
    @Id
    Long comentariosProductoId;
    String comentariosProducto;
    Long valoracion;

    public Long getComentariosProductoId() {
        return comentariosProductoId;
    }

    public void setComentariosProductoId(Long comentariosProductoId) {
        this.comentariosProductoId = comentariosProductoId;
    }

    public String getComentariosProducto() {
        return comentariosProducto;
    }

    public void setComentariosProducto(String comentariosProducto) {
        this.comentariosProducto = comentariosProducto;
    }

    public Long getValoracion() {
        return valoracion;
    }

    public void setValoracion(Long valoracion) {
        this.valoracion = valoracion;
    }
    
}
