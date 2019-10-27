package grafo;

public class Nodo {
	private int nroNodo;
	private boolean dragon = false;
	
	public Nodo(int nroNodo) {
		this.nroNodo=nroNodo;
	}
	
	public boolean esDragon() {
		return dragon;
	}
}
