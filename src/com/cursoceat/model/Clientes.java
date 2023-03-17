package com.cursoceat.model;

public class Clientes {

	public static int idCliente;
	private String nombreCliente;	
	private String apellidoCliente;
	private String direccionCliente;
	private String localidadCliente;
	//pais lo referencio del enum
	Pais paisCliente;
	private String telefonoCliente;
	private String nif;
	private int idTemp;
	public Clientes(String nombreCliente, String apellidoCliente, String direccionCliente, String localidadCliente,
			Pais paisCliente, String telefonoCliente, String nif) {
		this.nombreCliente = nombreCliente;
		this.apellidoCliente = apellidoCliente;
		this.direccionCliente = direccionCliente;
		this.localidadCliente = localidadCliente;
		this.paisCliente = paisCliente;
		this.telefonoCliente = telefonoCliente;
		this.nif = nif;
		this.idTemp=++idCliente;
	}
	public Clientes() {
		this.idTemp=++idCliente;
	}
	public static int getIdCliente() {
		return idCliente;
	}
	public static void setIdCliente(int idCliente) {
		Clientes.idCliente = idCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getApellidoCliente() {
		return apellidoCliente;
	}
	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}
	public String getDireccionCliente() {
		return direccionCliente;
	}
	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}
	public String getLocalidadCliente() {
		return localidadCliente;
	}
	public void setLocalidadCliente(String localidadCliente) {
		this.localidadCliente = localidadCliente;
	}
	public Pais getPaisCliente() {
		return paisCliente;
	}
	public void setPaisCliente(Pais paisCliente) {
		this.paisCliente = paisCliente;
	}
	public String getTelefonoCliente() {
		return telefonoCliente;
	}
	public void setTelefonoCliente(String telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public int getIdTemp() {
		return idTemp;
	}
	@Override
	public String toString() {
		return "Clientes [idTemp=" + idTemp + ", nombreCliente=" + nombreCliente + ", apellidoCliente="
				+ apellidoCliente + ", direccionCliente=" + direccionCliente + ", localidadCliente=" + localidadCliente
				+ ", paisCliente=" + paisCliente + ", telefonoCliente=" + telefonoCliente + ", nif=" + nif + "]";
	}
	
}
