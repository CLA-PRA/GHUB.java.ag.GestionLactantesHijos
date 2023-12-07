package negocios;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

import datos.ArbolAVL;
import datos.Mujer;
import datos.BTreePrinter;
import datos.Fecha;


public class Lactario {
	ArbolAVL abo = new ArbolAVL();
	TreeSet<Mujer> t = new TreeSet<Mujer>();
	LinkedList<Object> lista;
	
	
	public Lactario() {
		lista = new LinkedList<Object>();
			
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
	public boolean agregar_elementos(String id, String nombre,
			   int edad, Fecha fecha) throws Exception {
		try {
		
		   abo.insertar(new Mujer(id, nombre,edad,fecha));
		   
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
	public boolean recorrer_elementos() throws Exception{
		try {
			System.out.print("\nPreOrden:");
			abo.preorden();
			System.out.print("\nInOrden:");
			abo.inorden();
			System.out.print("\nPostOrden:");
			abo.postorden();
			System.out.print("\nNiveles:");
			
			System.out.print("\nJerárquico:\n");
			BTreePrinter.printNode(abo.getRaiz());
			
			return true;
			
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	public LinkedList<Object> recorrer_elementosUtilandoLinkedList() throws Exception{
		try {
			
			System.out.println("\nInOrden utilizando un LinkedList:");
			lista = abo.inorden2();
			
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
	
	public boolean recorrer_elementosTreeSet() throws Exception{
		try {
			//coloque el código necesario para recorrer la colección t
			//utilizando el Iterador Mujer, 
			
			for (Iterator<Mujer> it = t.iterator(); it.hasNext() ;)
			{
				System.out.println(it.next());
			}
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
		
	
}
		
	
	





