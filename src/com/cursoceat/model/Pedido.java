package com.cursoceat.model;

import java.time.LocalDateTime;

public class Pedido implements CalcularIVA{
	private static int idPedido;
	private int idLocal;
	private LocalDateTime fechaHoraPedido;
	private int idCliente;
	private int ivaPaisCliente;
	private int idProducto;
	private int cantidadProducto;
	private double precioProducto;
	private double totalSinIva;
	private double totalPedido;
	
	public Pedido() {
		this.fechaHoraPedido=LocalDateTime.now();
		this.idLocal=++idPedido;
	}
	
	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIvaPaisCliente() {
		return ivaPaisCliente;
	}

	public void setIvaPaisCliente(int ivaPaisCliente) {
		this.ivaPaisCliente = ivaPaisCliente;
	}

	
	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	
	

	public int getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public double getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}

	public double getTotalSinIva() {
		return totalSinIva;
	}

	public void setTotalSinIva(double precio,int cantidadProducto) {
		this.totalSinIva = precio*cantidadProducto;
	}

	public double getTotalPedido() {
		return totalPedido;
	}

	public void setTotalPedido(double totalsinIVa,int porcentaje) {
		this.totalPedido =totalsinIVa+(totalsinIVa*porcentaje/100) ;
	}

	@Override
	public String toString() {
		return "Pedido [ID Pedido=" + idLocal + ", fechaHoraPedido=" + fechaHoraPedido + ", idCliente=" + idCliente
				+ ", ivaPaisCliente=" + ivaPaisCliente + ", idProducto=" + idProducto + ", cantidadProducto="
				+ cantidadProducto + ", precioProducto=" + precioProducto + ", totalSinIva=" + totalSinIva
				+ ", totalPedido=" + totalPedido + "]";
	}

	/**
	 * @category Interface
	 * @description Implementamos el calculo del iva según pais
	 */
	@Override
	public double calculo(double importe, int porcentaje) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
