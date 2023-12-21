package com.example.market.persitence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Categoria {

    @Id
    @Column(name = "id_categoria")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCategoria;

    private String descripcion;
    private boolean estado;

    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
