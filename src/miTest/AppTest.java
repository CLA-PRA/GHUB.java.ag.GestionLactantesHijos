package miTest;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import negocios.Lactario;
import datos.Fecha;

class AppTest {

		private Lactario lact = new Lactario();
		
				
		@Test
		public void test_agregarElementosAVL() throws Exception {
			boolean condicion=lact.agregar_elementos("2", "Ana",20,new Fecha("01/02/2003"));
			assertTrue(condicion, "Elemento agregado con éxito en AVL");
			
		}
		@Test
		public void test_agregarElementosTreeSet() throws Exception {
			boolean condicion=lact.agregar_elementosTreeSet("2", "Ana",20,new Fecha("01/02/2003"));
			assertTrue(condicion, "Elemento agregado con éxito en TreeSet");
			
		}
		
		@Test
		public void test_eliminarElementosAVL() throws Exception {
			lact.agregar_elementos("2", "Ana",20,new Fecha("01/02/2003"));
			boolean condicion=lact.eliminar_elementos("2", "Ana",20,new Fecha("01/02/2003"));
			assertTrue(condicion, "Elemento eliminado con éxito en AVL");
			
			
		}
		@Test
		public void test_eliminarElementosTreeSet() throws Exception {
			lact.agregar_elementos("2", "Ana",20,new Fecha("01/02/2003"));
			boolean condicion=lact.eliminar_elementosTreeSet("2", "Ana",20,new Fecha("01/02/2003"));
			assertTrue(condicion, "Elemento eliminado con éxito en TreeSet");
			
		}
		
		@Test
		public void test_buscarElementosAVL() throws Exception {
			
			lact.agregar_elementos("2", "Ana",20,new Fecha("01/02/2003"));
			boolean condicion = lact.buscar_elementos("2", "Ana",20,new Fecha("01/02/2003"));
			assertTrue(condicion, "Elemento encontrado en AVL");
			
			lact.eliminar_elementos("2", "Ana",20,new Fecha("01/02/2003"));
			condicion = lact.buscar_elementos("1", "Ana",20,new Fecha("01/02/2003"));
			assertFalse(condicion," Elemento no encontradp en AVL");
			
		}
		@Test
		public void test_buscarElementosTreeSet() throws Exception {
			
			lact.agregar_elementosTreeSet("2", "Ana",20,new Fecha("01/02/2003"));
			boolean condicion = lact.buscar_elementosTreeSet("2", "Ana",20,new Fecha("01/02/2003"));
			assertTrue(condicion, "Elemento encontrado en TreeSet");
			
			lact.eliminar_elementosTreeSet("2", "Ana",20,new Fecha("01/02/2003"));
			condicion = lact.buscar_elementosTreeSet("1", "Ana",20,new Fecha("01/02/2003"));
			assertFalse(condicion," Elemento no encontradp en TreeSet");
			
		}
		
		@Test
		public void test_recorrerElementosAVL() throws Exception {
			boolean condicion=lact.agregar_elementos("2", "Ana",21,new Fecha("01/02/2002"));
			assertTrue(condicion, "Elemento agregado con éxito en AVL");
			condicion=lact.agregar_elementos("5", "Carmen",19,new Fecha("01/02/2004"));
			assertTrue(condicion, "Elemento agregado con éxito en AVL");
			condicion=lact.agregar_elementos("1", "Zelda",20,new Fecha("01/02/2003"));
			assertTrue(condicion, "Elemento agregado con éxito en AVL");
			
			condicion = lact.recorrer_elementos();
			assertTrue(condicion, "Recorrido exitoso en AVL");	
			
		}
		
		@Test
		public void test_recorrerElementosAVLutilizandoLinkedList() throws Exception {
			lact.agregar_elementos("1", "Zelda",20,new Fecha("01/02/2003"));
			lact.agregar_elementos("5", "Carmen",19,new Fecha("01/02/2004"));
			lact.agregar_elementos("2", "Bertha",18,new Fecha("01/02/2005"));
			lact.agregar_elementos("7", "Ana",21,new Fecha("01/02/2002"));
			lact.agregar_elementos("3", "Gabriela",22,new Fecha("01/02/2001"));
			lact.agregar_elementos("4", "Alicia",15,new Fecha("01/02/2008"));
			lact.agregar_elementos("6", "Sofia",23,new Fecha("01/02/2000"));
			LinkedList<Object> lista = new LinkedList<Object>();
			lista = lact.recorrer_elementosUtilandoLinkedList();
			
			
			String[] nombresEsperados = { "Alicia", "Ana", "Bertha","Carmen","Gabriela"
					                      , "Sofia","Zelda"};
			String[] nombresActuales = new String [7];
			for (int i=0;i<nombresEsperados.length;i++)
			{
				nombresActuales[i]=lista.get(i).toString();
			}
			
			
			 assertArrayEquals(null, nombresEsperados, nombresActuales);
			 
			 assertArrayEquals("Fallo - No son los mismos arreglos",
					 nombresEsperados,nombresActuales);
			
		}
		
		
		@Test
		public void test_recorrerElementosTreeSet() throws Exception {
			
			boolean condicion=lact.agregar_elementosTreeSet("2", "Ana",21,new Fecha("01/02/2003"));
			assertTrue(condicion, "Elemento agregado con éxito en TreeSet");
			condicion=lact.agregar_elementosTreeSet("5", "Carmen",19,new Fecha("01/02/2004"));
			assertTrue(condicion, "Elemento agregado con éxito en AVL");
			condicion=lact.agregar_elementosTreeSet("1", "Zelda",20,new Fecha("01/02/2003"));
			assertTrue(condicion, "Elemento agregado con éxito en AVL");
			
			 condicion = lact.recorrer_elementosTreeSet();
			assertTrue(condicion, "Recorrido exitoso en TreeSet");
			
		}
		
		

}
