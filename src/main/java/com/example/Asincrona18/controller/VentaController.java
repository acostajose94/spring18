package com.example.Asincrona9.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.Asincrona9.entity.Venta;
import com.example.Asincrona9.service.VentaService;

@Controller
public class VentaController {
	@Autowired
	private VentaService ventaService;
	
	@GetMapping("/listado")
	public String listar(Model model) {
		List<Venta> lista = ventaService.listarTodos();
		model.addAttribute("titulo", "LISTA DE PRODUCTOS");
		model.addAttribute("productos", lista);
		return "listado";
	}
}
