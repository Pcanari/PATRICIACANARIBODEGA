package com.idat.EC02PATRICIACA√ĎARIBODEGA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EC02PATRICIACA√ĎARIBODEGA.model.Productos;

@Repository
public interface ProductoRepository extends JpaRepository<Productos,Integer>{
	


}
