package uI;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


import datos.Fecha;
import datos.Hijo;
import datos.Mujer;
import negocios.Lactario;

public class MenuOpciones {
	static Scanner entrada = new  Scanner(System.in);
	private Lactario lact = new Lactario();
	private List<Hijo> hijos= new ArrayList<Hijo>();
	
	
	
	
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
			
			final String CENTINELA="99";
			String idHijo;
			String nombreHijo;
			
			Fecha fechaHijo;
			System.out.println(" *** CAPTURA DE HIJO/HIJA DE LA MADRE ***");
			System.out.print("Introduce ID Hijo/Hija:");
			idHijo = entrada.next();
			
			do {
				
				
				System.out.print("Introduce Nombre Hijo/Hija:");
				nombreHijo=entrada.next();
				
				System.out.print("Introduce Fecha Nacimiento (MM/DD/AAAA) Hijo/Hija:");
				fechaHijo = new Fecha(entrada.next());
				
				//Agrego objeto hijo a una lista auxiliar
				
				lact.agregar_hijos(idHijo, nombreHijo, fechaHijo);
				
				
				
				System.out.print("Introduce ID Hijo/Hija (99 para terminar):");
				idHijo = entrada.next();
				
				
			}while(!idHijo.equals(CENTINELA));
			System.out.println("Captura Hijos/Hijas Finalizada");
			hijos=lact.recorrer_hijos();
			lact.agregar_elementos(id,nombre,edad,fecha,hijos);
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
	public void buscar_elemento_id() throws Exception {
	
		    String id;;
		    String nombre;
		    int edad;
		    Fecha fecha;
			
			System.out.print("Introduce ID Mujer:");
			id = entrada.next();
			
			Mujer m = lact.buscar_mujer(id);
			
			if(m !=null) {
				nombre = m.getNombre();
				edad = m.getEdad();
				fecha = m.getFechaNacimiento();
				System.out.println("Nombre:"+nombre);   
					
				System.out.println("Edad:"+edad);
					
				System.out.println("Fecha (MM/DD/AAAA):"+fecha);
				
				
				
			}
			else
				System.out.println("*** NO ENCONTRADO ***");
				
	 	
		
	}
	
	/**
	 * Recorre un árbol AVL
	 * @throws Exception
	 */
	public void recorrer_elementos() throws Exception{
		
		lact.recorrer_elementosInOrden();
		lact.recorrer_elementosPostOrden();
		lact.recorrer_elementosPreOrden();
		
	}
	/**
	 * Recorre un TreeSet
	 * @throws Exception
	 */
	public void recorrer_elementosTreeSet() throws Exception{
		lact.recorrer_elementosTreeSet();
		
		
	}
	
	
	
}

	

	

