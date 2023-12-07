package uI;
import java.util.Scanner;


public class Menu {
	static Scanner entrada = new  Scanner(System.in);
	
	static MenuOpciones  iOpc = new MenuOpciones();
	
	public void lectura() throws Exception{
		imprimirMenu();			
	}
	private static void imprimirMenu() throws Exception {
		int opcion=0;
		while (opcion!=99) {
			do {
				System.out.println("\t********* MENU PRINCIPAL **********");
				System.out.println("\t*  1. Agregar AVL/TreeSet         *");
				System.out.println("\t*  2. Eliminar AVL/TreeSet        *");
				System.out.println("\t*  3. Buscar AVL                  *");
				System.out.println("\t*  4. Mostrar AVL                 *");	
				System.out.println("\t*  5. Buscar TreeSet              *");
				System.out.println("\t*  6. Mostrar TreeSet             *");	
				System.out.println("\t*                                 *");
				System.out.println("\t* 99. Salir                       *");
				System.out.println("\t***********************************");
				System.out.print("Seleccione opción ->");
				opcion = entrada.nextInt();
				switch  (opcion) {
				case 1:
					iOpc.agregar_elementos();
					break;
				case 2:
					iOpc.eliminar_elementos();
					break;
				case 3:
					iOpc.buscar_elementos();
					break;
				case 4:
					iOpc.recorrer_elementos();
					break;
				case 5:
					iOpc.buscar_elementosTreeSet();
					break;
				case 6:
					iOpc.recorrer_elementosTreeSet();
					break;
				
				case 99:
					salir();
					break;
				default:
					System.out.println("Opcion inválida");
						
				}
			}while (opcion<0 || opcion>6 && opcion != 99);
		}
	}
	private static void salir() {
		System.out.println("Sesion Finalizada");
		System.out.println("Adios!");
		System.exit(0);
	}

}
	

	

