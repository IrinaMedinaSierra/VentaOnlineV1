package com.cursoceat.controller;

import java.util.ArrayList;

import com.cursoceat.model.Productos;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Productos miProductos=new Productos("Camiseta Roja", 15.5, "c:\\imagenes\\img1.jpg",
				"Camisate de algodon","100% Algodon, Lava a Maquina 30º.",10 );
		ArrayList<Productos> p1=new ArrayList<Productos>();
		p1.add(miProductos);
		System.out.println(p1.toString());
		miProductos.aumentarStock(5);
		System.out.println(p1.toString());
		Productos miProductos2=new Productos("Camiseta Azul", 13.5, "c:\\imagenes\\img2.jpg",
				"Camisate de poliester","100% Poliester, Lava a Maquina 50º.",25 );
		p1.add(miProductos2);
		System.out.println(p1.toString());
		miProductos2.restarStock(3);
		System.out.println(p1.toString());
	}
}
