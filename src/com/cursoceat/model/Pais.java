package com.cursoceat.model;

public enum Pais {

	ES(21),FR(20),PT(23);
	
	int pocentaje;

	private Pais(int pocentaje) {
		this.pocentaje = pocentaje;
	}

	public int getPocentaje() {
		return pocentaje;
	}
	
}
