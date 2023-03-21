package com.cursoceat.controller;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

import com.cursoceat.model.Clientes;
import com.cursoceat.model.Pais;
import com.cursoceat.model.Pedido;
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
		Clientes miCliente1=new Clientes("María", "Pérez", "Calle Oriente ,59", "Tomelloso", Pais.ES, "655555555", "06587596N");
		System.out.println(miCliente1.toString());
		
		Pedido miPedido=new Pedido();
		System.out.println(miPedido.toString());
		miPedido.setIdCliente(miCliente1.getIdTemp());
		miPedido.setIvaPaisCliente(miCliente1.getPaisCliente().getPocentaje());
		miPedido.setIdProducto(miProductos.getIdProductoTem());
		miPedido.setCantidadProducto(5);
		miPedido.setPrecioProducto(miProductos.getPrecioProducto());
		miPedido.setTotalSinIva(miPedido.getPrecioProducto(),miPedido.getCantidadProducto());
		miPedido.setTotalPedido(miPedido.getTotalSinIva(),miPedido.getIvaPaisCliente());
		System.out.println(miPedido.toString());
		
		
		
	}
}


