package datos;

//Coloque aquí el código para que implemente este clase
//con las interfases ComparableMujer y Comparable
public class Mujer implements ComparableMujer,Comparable<Mujer>{
	
	
	private String id;
	private String nombre;
	private int edad;
	private Fecha fechaNacimiento;
	
	public Mujer(String id, String nombre, int edad, Fecha fechaNacimiento) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.fechaNacimiento=fechaNacimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Fecha fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public boolean esMenor(Object q) {
		Mujer obj = (Mujer)q;
		boolean valor =this.nombre.compareTo(obj.getNombre())<0?true:false;
		return valor;	
	}
	public boolean esMayor(Object q) {
        Mujer obj = (Mujer)q;	
		boolean valor =this.nombre.compareTo(obj.getNombre())>0?true:false;
		return valor;
	}
	public boolean esIgual(Object q) {
		Mujer obj = (Mujer)q;	
		boolean valor =this.nombre.compareTo(obj.getNombre())==0?true:false;
		return valor;
		
	}
		

	@Override
	public String toString() {
		//return  "Id:"+id + "," + nombre +","+edad+" anios,"+"Fecha:"+fechaNacimiento ;
	    return nombre;
	}
	//Sobreescriba el método necesario para que ordene los Nodos
	//  en base al atributo Nombre
	@Override
	public int compareTo(Mujer o) {
		int valor=this.nombre.compareTo(o.getNombre());
		return valor;
	}
	
	
	
	
	
		
	
		

}
