/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.konrad.project1.ntd.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author PC
 */
@Entity
@Table(name="detalle_pedido")
public class DetallePedidoEntity implements Serializable{
    /**
     * llave primaria del pedido
     */
    @Id
    @Column(name="id_pedido", unique=true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /**
     * fecha del pedido
     */
    @Column(name="fecha_pedido", unique=false)
    @Temporal(TemporalType.DATE)
    private Date fechaPedido;
    /**
     * llave foranea del pedido hacia el producto
     */
    @ManyToOne
    @JoinColumn(name="id_producto", unique=false)
    private Long productoId;
    /**
     * llave foranea del pedido hacia la factura
     */
    @ManyToOne
    @JoinColumn(name="id_factura", unique=false)
    private Long facturaId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Long getProductoId() {
        return productoId;
    }

    public void setProductoId(Long productoId) {
        this.productoId = productoId;
    }

    public Long getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(Long facturaId) {
        this.facturaId = facturaId;
    }
}
