package miTest;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;


import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import negocios.Lactario;
import datos.Fecha;
import datos.Hijo;
import datos.Mujer;

import java.util.List;


class AppTest {

		private Lactario lact = new Lactario();
		private List<Hijo> hijos;
		
				
		@Test
		public void test_agregarElementosAVL() throws Exception {
			
			
			lact.agregar_hijos("1", "Anita1", new Fecha("11/12/2023"));
			lact.agregar_hijos("2", "Pedrito", new Fecha("11/12/2020"));
			lact.agregar_hijos("3", "Juanita", new Fecha("11/12/2017"));
			hijos = lact.recorrer_hijos();
			
			
			boolean condicion=lact.agregar_elementos("2", "Ana",20,new Fecha("01/02/2003"),hijos);
			assertTrue(condicion, "Elemento agregado con éxito en AVL");
			
		}
		

		
		@Test
        public void test_buscarMujer() throws Exception {
			
			lact.agregar_hijos("1", "Anita1", new Fecha("11/12/2023"));
			lact.agregar_hijos("2", "Pedrito", new Fecha("11/12/2020"));
			lact.agregar_hijos("3", "Juanita", new Fecha("11/12/2017"));
			hijos = lact.recorrer_hijos();
			lact.agregar_elementos("2", "Ana",20,new Fecha("01/02/2003"),hijos);
			
			
			Mujer m_obtenido = lact.buscar_mujer("2");
			
			
			assertEquals(m_obtenido.getNombre(),"Ana");
			
			
			
		}
		
		
		@Test
		public void test_recorrerElementosInOrden() throws Exception {
			lact.agregar_hijos("1", "Anita1", new Fecha("11/12/2023"));
			lact.agregar_hijos("2", "Pedrito", new Fecha("11/12/2020"));
			lact.agregar_hijos("3", "Juanita", new Fecha("11/12/2017"));
			hijos = lact.recorrer_hijos();
			lact.agregar_elementos("01", "Zelda",20,new Fecha("01/02/2003"),hijos);
			lact.agregar_elementos("05", "Carmen",19,new Fecha("01/02/2004"),hijos);
			lact.agregar_elementos("02", "Bertha",18,new Fecha("01/02/2005"),hijos);
			lact.agregar_elementos("07", "Ana",21,new Fecha("01/02/2002"),hijos);
			lact.agregar_elementos("03", "Gabriela",22,new Fecha("01/02/2001"),hijos);
			lact.agregar_elementos("04", "Alicia",15,new Fecha("01/02/2008"),hijos);
			lact.agregar_elementos("06", "Sofia",23,new Fecha("01/02/2000"),hijos);
			LinkedList<Object> lista = new LinkedList<Object>();
			lista = lact.recorrer_elementosInOrden();
			
			
			String[] nombresEsperados = { "01", "02", "03","04","05"
					                      , "06","07"};
			String[] nombresActuales = new String [7];
			for (int i=0;i<nombresActuales.length;i++)
			{
				nombresActuales[i]=lista.get(i).toString();
				
			}
			
			 assertArrayEquals("Fallo - No son los mismos arreglos",
					 nombresEsperados,nombresActuales);
			
		}
		@Test
		public void test_recorrerElementosPreOrden() throws Exception {
			lact.agregar_hijos("1", "Anita1", new Fecha("11/12/2023"));
			lact.agregar_hijos("2", "Pedrito", new Fecha("11/12/2020"));
			lact.agregar_hijos("3", "Juanita", new Fecha("11/12/2017"));
			hijos = lact.recorrer_hijos();
			lact.agregar_elementos("01", "Zelda",20,new Fecha("01/02/2003"),hijos);
			lact.agregar_elementos("05", "Carmen",19,new Fecha("01/02/2004"),hijos);
			lact.agregar_elementos("02", "Bertha",18,new Fecha("01/02/2005"),hijos);
			lact.agregar_elementos("07", "Ana",21,new Fecha("01/02/2002"),hijos);
			lact.agregar_elementos("03", "Gabriela",22,new Fecha("01/02/2001"),hijos);
			lact.agregar_elementos("04", "Alicia",15,new Fecha("01/02/2008"),hijos);
			lact.agregar_elementos("06", "Sofia",23,new Fecha("01/02/2000"),hijos);
			LinkedList<Object> lista = new LinkedList<Object>();
			lista = lact.recorrer_elementosPreOrden();
			
			
			String[] nombresEsperados = { "03", "02", "01","05","04"
					                      , "07","06"};
			String[] nombresActuales = new String [7];
			for (int i=0;i<nombresActuales.length;i++)
			{
				nombresActuales[i]=lista.get(i).toString();
				
			}
			
			 assertArrayEquals("Fallo - No son los mismos arreglos",
					 nombresEsperados,nombresActuales);
			
		}
		@Test
		public void test_recorrerElementosPostOrden() throws Exception {
			lact.agregar_hijos("1", "Anita1", new Fecha("11/12/2023"));
			lact.agregar_hijos("2", "Pedrito", new Fecha("11/12/2020"));
			lact.agregar_hijos("3", "Juanita", new Fecha("11/12/2017"));
			hijos = lact.recorrer_hijos();
			lact.agregar_elementos("01", "Zelda",20,new Fecha("01/02/2003"),hijos);
			lact.agregar_elementos("05", "Carmen",19,new Fecha("01/02/2004"),hijos);
			lact.agregar_elementos("02", "Bertha",18,new Fecha("01/02/2005"),hijos);
			lact.agregar_elementos("07", "Ana",21,new Fecha("01/02/2002"),hijos);
			lact.agregar_elementos("03", "Gabriela",22,new Fecha("01/02/2001"),hijos);
			lact.agregar_elementos("04", "Alicia",15,new Fecha("01/02/2008"),hijos);
			lact.agregar_elementos("06", "Sofia",23,new Fecha("01/02/2000"),hijos);
			LinkedList<Object> lista = new LinkedList<Object>();
			lista = lact.recorrer_elementosPostOrden();
			String[] nombresEsperados = { "01", "02", "04","06","07"
                    , "05","03"};
            String[] nombresActuales = new String [7];
            for (int i=0;i<nombresActuales.length;i++)
            {
                nombresActuales[i]=lista.get(i).toString();

             }

               assertArrayEquals("Fallo - No son los mismos arreglos",
                nombresEsperados,nombresActuales);
			
	    }
		
		
		
		
		

}
