package uI;

import java.util.Scanner;


import datos.Fecha;
import negocios.Lactario;

public class MenuOpciones {
	static Scanner entrada = new  Scanner(System.in);
	private Lactario lact = new Lactario();
	
	
	/**
	 * Agregar un elemento al árbol AVL, validando que no exista
	 * Agregar un elemento en un TreeSet
	 */
	public void agregar_elementos() {
		try {
			String id;
			String nombre;
			int edad;
			Fecha fecha;
			
			do {
				
				System.out.print("Introduce ID:");
				id = entrada.next();
				System.out.print("Introduce Nombre:");
				nombre=entrada.next();
				System.out.print("Introduce Edad:");
				edad=entrada.nextInt();
				System.out.print("Introduce Fecha (MM/DD/AAAA):");
				fecha = new Fecha(entrada.next());
				
				
			}while (lact.buscar_elementos(id,nombre,edad,fecha));
			lact.agregar_elementos(id,nombre,edad,fecha);
			lact.agregar_elementosTreeSet(id, nombre, edad, fecha);
			
			System.out.println("Insertado con éxito");
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
				
		}
	
		
	}
	/**
	 * Elimina un elemento del árbol AVLL validando que el elemento exista
	 * Elimina un elemento de un TreeSet
	 */
	public void eliminar_elementos() {
		try {
			String id;
			String nombre;
			int edad;
			Fecha fecha;
			
			do {
				System.out.print("Introduce ID:");
				id = entrada.next();
				System.out.print("Introduce Nombre:");
				nombre = entrada.next();
				System.out.print("Introduce Edad:");
				edad = entrada.nextInt();
				//entrada.next();
				System.out.print("Introduce Fecha (MM/DD/AAAA):");
				fecha = new Fecha(entrada.next());
				
				
			} while (!lact.buscar_elementos(id,nombre,edad,fecha));
		   lact.eliminar_elementos(id,nombre,edad,fecha);
		   lact.eliminar_elementosTreeSet(id, nombre, edad, fecha);
		   System.out.println("Eliminado con éxito");
		   
		}
		catch (Exception e) {
			e.printStackTrace();
			
			
		}
		
		
	}
	/**
	 * Busca un elemento en el árbolAVL  
	 */
	
	public void buscar_elementos() {
		try {
			String id;
			String nombre;
			int edad;
			Fecha fecha;
			
			System.out.print("Introduce ID:");
			id = entrada.next();
			System.out.print("Introduce Nombre:");
			nombre = entrada.next();
			System.out.print("Introduce Edad:");
			edad = entrada.nextInt();
			
			System.out.print("Introduce Fecha (MM/DD/AAAA):");
			
			fecha = new Fecha(entrada.next());
			
			if (lact.buscar_elementos(id,nombre,edad,fecha)) 
				System.out.println(" ID:"+id+" Nombre:"+nombre+" Edad:"+edad+" Fecha:"+fecha);
				
			else 
				System.out.println("¡NO Existen datos con esas características!");
				
			
		}
		catch (Exception e) {
			e.printStackTrace();

			
		}
		
		
		
	}
	/**
	 * Busca un elemento en un TreeSet
	 */
	public void buscar_elementosTreeSet() {
		try {
			String id;
			String nombre;
			int edad;
			Fecha fecha;
			
			System.out.print("Introduce ID:");
			id = entrada.next();
			System.out.print("Introduce Nombre:");
			nombre = entrada.next();
			System.out.print("Introduce Edad:");
			edad = entrada.nextInt();
			
			System.out.print("Introduce Fecha (MM/DD/AAAA):");
			
			fecha = new Fecha(entrada.next());
			
			if (lact.buscar_elementosTreeSet(id,nombre,edad,fecha)) 
				System.out.println(" ID:"+id+" Nombre:"+nombre+" Edad:"+edad+" Fecha:"+fecha);
				
			else 
				System.out.println("¡NO Existen datos con esas características!");
				
			
		}
		catch (Exception e) {
			e.printStackTrace();

		}	
	}
	/**
	 * Recorre un árbol AVL
	 * @throws Exception
	 */
	public void recorrer_elementos() throws Exception{
		lact.recorrer_elementos();
		lact.recorrer_elementosUtilandoLinkedList();
		
	}
	/**
	 * Recorre un TreeSet
	 * @throws Exception
	 */
	public void recorrer_elementosTreeSet() throws Exception{
		lact.recorrer_elementosTreeSet();
		
		
	}
	
	
	
}

	

	

