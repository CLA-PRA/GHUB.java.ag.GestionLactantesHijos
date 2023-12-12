package datos;

import java.util.ArrayList;
import java.util.List;

//Coloque aquí el código para que implemente este clase
//con las interfases ComparableMujer y Comparable
public class Mujer implements ComparableMujer,Comparable<Mujer>{
	
	
	private String id;
	private String nombre;
	private int edad;
	private Fecha fechaNacimiento;
	private List<Hijo> hijos;
	
	
	public void setHijos(List<Hijo> hijos) {
		this.hijos = hijos;
	}
	public Mujer(String id, String nombre, int edad, Fecha fechaNacimiento) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.fechaNacimiento=fechaNacimiento;
	
		
	}
	public Mujer(String id, String nombre, int edad, Fecha fechaNacimiento, List<Hijo> hijos) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.fechaNacimiento=fechaNacimiento;
		this.hijos=hijos;
		
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
	public List<Hijo> getHijos() {
		return hijos;
	}
	public boolean esMenor(Object q) {
		Mujer obj = (Mujer)q;
		boolean valor =this.id.compareTo(obj.getId())<0?true:false;
		
		return valor;	
	}
	public boolean esMayor(Object q) {
        Mujer obj = (Mujer)q;	
		boolean valor =this.id.compareTo(obj.getId())>0?true:false;
		return valor;
	}
	public boolean esIgual(Object q) {
		Mujer obj = (Mujer)q;	
		boolean valor =this.id.compareTo(obj.getId())==0?true:false;
		return valor;
		
	}
		

	@Override
	public String toString() {
		//return  "Id:"+id + "," + nombre +","+edad+" anios,"+"Fecha:"+fechaNacimiento ;
	    return id;
	}
	
	@Override
	public int compareTo(Mujer o) {
		int valor=this.id.compareTo(o.getId());
		
		
		return valor;
		
	}
	
	
	
	
	
		
	
		

}
