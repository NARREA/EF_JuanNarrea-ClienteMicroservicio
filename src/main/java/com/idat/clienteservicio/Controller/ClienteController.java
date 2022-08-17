package com.idat.clienteservicio.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.clienteservicio.Modelo.Cliente;
import com.idat.clienteservicio.Service.clienteService;

@Controller
@RequestMapping("/api/cliente/v1")
public class ClienteController {
	
	@Autowired
	private clienteService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Cliente> listar(){
		return service.listar();
	}
	
	
	@GetMapping("/listar/{id}")
	public @ResponseBody Cliente obtener(@PathVariable Integer id) {
		return service.obtenerId(id);
	}
	
	@PostMapping("/guardar")
	public  ResponseEntity<Void> guardar(@RequestBody Cliente cliente) {
		service.guardar(cliente);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@PutMapping("/actualizar")
	public @ResponseBody void actualizar(@RequestBody Cliente cliente) {
		service.actualizar(cliente);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		
		Cliente cliente= service.obtenerId(id);
		if(cliente != null) {
			service.eliminar(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}		
		
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
	}

}
