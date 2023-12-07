package datos;

public class Nodo  {
	private ComparableMujer valor;
	private Nodo izquierdo;
	private Nodo derecho;
	private int fe;//Factor de equilibrio
	public Nodo() {
		valor = null;
		izquierdo = null;
		derecho= null;
	}
	public Nodo(ComparableMujer valor) {
		this.valor = valor;
		izquierdo = null;
		derecho = null;
		
	}
	
	public int getFe() {
		return fe;
	}
	public void setFe(int fe) {
		this.fe = fe;
	}
	public ComparableMujer getValor() {
		return valor;
	}
	public void setValor(ComparableMujer valor) {
		this.valor = valor;
	}
	public Nodo getIzquierdo() {
		return izquierdo;
	}
	public void setIzquierdo(Nodo izquierdo) {
		this.izquierdo = izquierdo;
	}
	public Nodo getDerecho() {
		return derecho;
	}
	public void setDerecho(Nodo derecho) {
		this.derecho = derecho;
	}
	
	

}
