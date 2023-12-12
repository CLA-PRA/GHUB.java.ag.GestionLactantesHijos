package negocios;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Hashtable;

import datos.ArbolAVL;
import datos.Mujer;

import datos.Fecha;

import datos.Hijo;


public class Lactario {
	ArbolAVL abo = new ArbolAVL();
	TreeSet<Mujer> t = new TreeSet<Mujer>();
	LinkedList<Object> lista;
	//Colocar un objeto HashTable que guarde un String (ID de Mujer) y
	// un objeto Mujer
	Hashtable<String,Mujer> ht;
	//Coloque aquí un objeto tipo ArrayList para que guarde los hijo de una mujer
	List<Hijo> hijos;
	
	
	
	public Lactario() {
		lista = new LinkedList<Object>();
		ht = new Hashtable<String,Mujer>();
		hijos = new ArrayList<Hijo>();
		
	}
	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param edad
	 * @param fecha
	 * @param hijos
	 * @return
	 * @throws Exception
	 */
	public boolean agregar_elementos(String id, String nombre,
			   int edad, Fecha fecha, List<Hijo> hijos) throws Exception {
		try {
		
		   //Agrega un registro mujer al árbol
		   abo.insertar(new Mujer(id, nombre,edad,fecha,hijos));
		   //Agrega un registro mujer a la Tabla Hash
		   ht.put(id, new Mujer(id,nombre,edad,fecha,hijos));
		   
		   return true;
		
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	public boolean agregar_hijos(String Id, String nombre, Fecha fecha) {
		//Agrege aquí a la lista de hijos
		hijos.add(new Hijo(Id,nombre,fecha));
		return true;
	}
	
	public List<Hijo> recorrer_hijos() {
		return hijos;
		
	}
	
	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param edad
	 * @param fecha
	 * @return
	 * @throws Exception
	 */
	/*
	 * Se elimina porque ahora se debe incluir un registro hijo, 
	 * por cada mujer
	public boolean agregar_elementos(String id, String nombre,
			   int edad, Fecha fecha) throws Exception {
		try {
		
		   abo.insertar(new Mujer(id, nombre,edad,fecha));
		   ht.put(id, new Mujer(id,nombre,edad,fecha));
		   
		   
		   return true;
		
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	*/
	
	
	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param edad
	 * @param fecha
	 * @return
	 * @throws Exception
	 */
	public boolean agregar_elementosTreeSet(String id, String nombre,
			   int edad, Fecha fecha) throws Exception {
		try {
		
		   //Agrege aquí el código para inserta un elemento en el Objeto TreeSet
		   t.add(new Mujer(id,nombre,edad,fecha));
		   return true;
		
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param edad
	 * @param fecha
	 * @return
	 * @throws Exception
	 */
	
	public boolean eliminar_elementos(String id, String nombre,
			int edad, Fecha fecha) throws Exception{
		try {
		   //Agrege aquí el código para eliminar un elemento en el Objeto ArbolAVL
		   abo.eliminar(new Mujer(id, nombre,edad,fecha));
		   ht.remove(id);
		 
		   return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param edad
	 * @param fecha
	 * @return
	 * @throws Exception
	 */
	public boolean eliminar_elementosTreeSet(String id, String nombre,
			int edad, Fecha fecha) throws Exception{
		try {
			//Agrege aquí el código para eliminar un elemento en el Objeto TreeSet
		   t.remove(new Mujer(id,nombre,edad,fecha));
		   return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	/**
	 * 
	 * @param valor elemento buscado
	 * @return si el elemento buscado existe, regresa true
	 *       en caso contrario regresa false
	 */
	public boolean buscar_elementos(String id, String nombre,
			int edad, Fecha fecha) throws Exception{
		//Coloque aquí el código para que busque el objeto Mujer
		// y regrese verdadero si lo encuentra y falso si no
		if (abo.buscar(new Mujer(id, nombre, edad,fecha)) != null)
			return true;
		else return false;
		
	}
	
	
	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param edad
	 * @param fecha
	 * @return
	 * @throws Exception
	 */
	public boolean buscar_elementosTreeSet(String id, String nombre,
			int edad, Fecha fecha) throws Exception{
		//Agrege aquí el código para localice un elemento en el Objeto TreeSet
		// y devuelva verdadero en caso que lo encuntre y falso en caso que no
		if(t.contains(new Mujer(id,nombre,edad,fecha)))
			return true;
		else
			return false;
		
		
		
	}
	
	public LinkedList<Object> recorrer_elementosInOrden() throws Exception{
		try {
			
			System.out.println("\nInOrden:\n");
			lista = abo.inorden();
			
			for (Iterator<Object> it = lista.iterator(); it.hasNext() ;)
			{
				System.out.print(it.next()+" ");
			}
			System.out.println();
			
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		return lista;
		
	}
	public LinkedList<Object> recorrer_elementosPreOrden() throws Exception{
		try {
			
			System.out.println("\nPreOrden:\n");
			lista = abo.preorden();
			
			for (Iterator<Object> it = lista.iterator(); it.hasNext() ;)
			{
				System.out.print(it.next()+" ");
			}
			System.out.println();
			
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		return lista;
		
	}
	public LinkedList<Object> recorrer_elementosPostOrden() throws Exception{
		try {
			
			System.out.println("\nPostOrden:\n");
			lista = abo.postorden();
			
			for (Iterator<Object> it = lista.iterator(); it.hasNext() ;)
			{
				System.out.print(it.next()+" ");
			}
			System.out.println();
			
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		return lista;
		
	}
	
	public TreeSet<Mujer> recorrer_elementosTreeSet() {
		
			//coloque el código necesario para recorrer la colección t
			//utilizando el Iterador Mujer, 
			
			for (Iterator<Mujer> it = t.iterator(); it.hasNext() ;)
			{
				System.out.println(it.next());
			}
			return t;
		}
		
		
	
	/**
	 * Busca un ID de Mujer en un Tabla Hash
	 *   retorna un objeto Mujer si la encuentra y
	 *   null si no la encuentra
	 * @param iD
	 * @return
	 */
	public Mujer buscar_mujer(String iD) {
		
		return ht.get(iD);
		
	}
	
		
	
}
		
	
	





