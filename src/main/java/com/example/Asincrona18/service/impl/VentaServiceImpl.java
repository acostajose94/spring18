package com.example.Asincrona18.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Asincrona18.entity.Venta;
import com.example.Asincrona18.repository.VentaRepository;
import com.example.Asincrona18.service.VentaService;

@Service
public class VentaServiceImpl implements VentaService{
	@Autowired
	public VentaRepository repository;

	@Override
	public List<Venta> listarTodos(){
		List<Venta> lista = (List<Venta>) repository.findAll();
		return lista;
	}
}
