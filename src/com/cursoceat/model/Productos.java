package com.cursoceat.model;

import java.net.URL;

public class Productos {

	public static int idProducto;
	private String nombreProducto;
	private double precioProducto;
	private String  imagenUrl;
	private String descripcionCorta;
	private String descripcionLarga;
	private int stock;
	private int idProductoTem;
	public Productos(String nombreProducto, double precioProducto, String imagenUrl, String descripcionCorta,
			String descripcionLarga, int stock) {
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
		this.imagenUrl = imagenUrl;
		this.descripcionCorta = descripcionCorta;
		this.descripcionLarga = descripcionLarga;
		this.stock = stock;
		this.idProductoTem=++idProducto;
	}
	public Productos() {
		this.idProductoTem=++idProducto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public double getPrecioProducto() {
		return precioProducto;
	}
	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}
	public String getImagenUrl() {
		return imagenUrl;
	}
	public void setImagenUrl(String imagenUrl) {
		this.imagenUrl = imagenUrl;
	}
	public String getDescripcionCorta() {
		return descripcionCorta;
	}
	public void setDescripcionCorta(String descripcionCorta) {
		this.descripcionCorta = descripcionCorta;
	}
	public String getDescripcionLarga() {
		return descripcionLarga;
	}
	public void setDescripcionLarga(String descripcionLarga) {
		this.descripcionLarga = descripcionLarga;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getIdProductoTem() {
		return idProductoTem;
	}
	
	public void restarStock(int cantidad) {
		this.stock-=cantidad;
	}
	public void aumentarStock(int cantidad) {
		this.stock+=cantidad;
	}
	@Override
	public String toString() {
		return "Productos [nombreProducto=" + nombreProducto + ", precioProducto=" + precioProducto + ", imagenUrl="
				+ imagenUrl + ", descripcionCorta=" + descripcionCorta + ", descripcionLarga=" + descripcionLarga
				+ ", stock=" + stock + ", idProductoTem=" + idProductoTem + "]";
	}
	
	
	
	
	
}
