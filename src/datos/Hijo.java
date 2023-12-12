
package datos;
public class Hijo {
	private String id;
	private String nombre;
	
	private Fecha fechaNacimiento;
	private Mujer madre;
	
	public Hijo(String id, String nombre, Fecha fechaNacimiento) {
		
		this.id = id;
		this.nombre = nombre;
		
		this.fechaNacimiento = fechaNacimiento;
		
	}
	
	
	public Hijo(String id, String nombre, Fecha fechaNacimiento, Mujer madre) {
		super();
		this.id = id;
		this.nombre = nombre;
		
		this.fechaNacimiento = fechaNacimiento;
		this.madre = madre;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Fecha fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Mujer getMadre() {
		return madre;
	}
	public void setMadre(Mujer madre) {
		this.madre = madre;
	}
	
	
}
