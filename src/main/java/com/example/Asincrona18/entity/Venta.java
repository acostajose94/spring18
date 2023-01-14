package com.example.Asincrona18.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Venta {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "codigo")
	private String codigo;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "marca")
	private String marca;
	@Column(name = "modelo")
	private String modelo;
	@Column(name = "precio")
	private double precio;
	@Column(name = "stcck")
	private int stcck;
	@Column(name = "fabricacion")
	private int fabricacion;
	@Column(name = "foto")
	private String foto;
	
	public Venta() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStcck() {
		return stcck;
	}

	public void setStcck(int stcck) {
		this.stcck = stcck;
	}

	public int getFabricacion() {
		return fabricacion;
	}

	public void setFabricacion(int fabricacion) {
		this.fabricacion = fabricacion;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	@Override
	public String toString() {
		return "Venta [id=" + id + ", codigo=" + codigo + ", nombre=" + nombre + ", marca=" + marca + ", modelo="
				+ modelo + ", precio=" + precio + ", stcck=" + stcck + ", fabricacion=" + fabricacion + ", foto=" + foto
				+ "]";
	}
	
	
}
