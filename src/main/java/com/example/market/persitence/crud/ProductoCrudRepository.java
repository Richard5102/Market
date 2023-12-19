package com.example.market.persitence.crud;

import com.example.market.persitence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {


        List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

        Optional<List<Producto>> findByCantidadStockLessAndEstado(int cantidadStock, boolean estado);


}
