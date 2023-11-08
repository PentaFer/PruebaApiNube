package com.cibertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.entity.Pais;
import com.cibertec.service.PaisService;



@RestController
@RequestMapping("/rest/pais")
public class PaisController {
	
	@Autowired
	private PaisService servicio;
	
	@GetMapping("/lista")
	@ResponseBody
	public ResponseEntity<List<Pais>> listaPais(){
		List<Pais> lista = servicio.listaPaises();
		
		return ResponseEntity.ok(lista);
	}

}
