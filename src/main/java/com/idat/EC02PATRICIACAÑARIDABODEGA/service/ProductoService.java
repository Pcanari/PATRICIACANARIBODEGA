package com.idat.EC02PATRICIACA√ĎARIBODEGA.service;

import java.util.List;

import com.idat.EC02PATRICIACA√ĎARIBODEGA.dto.ProductoDTORequest;
import com.idat.EC02PATRICIACA√ĎARIBODEGA.dto.ProductoDTOResponse;

public interface ProductoService {
	
	
	void guardarProducto(ProductoDTORequest producto);
	void actualizarProducto(ProductoDTORequest producto);
	void eliminarProducto(Integer id);
	List<ProductoDTOResponse> listarProductos();
	ProductoDTOResponse obtenerProductoId(Integer id);

}
