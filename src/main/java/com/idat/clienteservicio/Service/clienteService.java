package com.idat.clienteservicio.Service;

import java.util.List;

import com.idat.clienteservicio.Modelo.Cliente;



public interface clienteService {
	
	List<Cliente> listar();
	Cliente obtenerId(Integer id);
	void guardar(Cliente cliente);
	void eliminar(Integer id);
	void actualizar(Cliente cliente);

}
