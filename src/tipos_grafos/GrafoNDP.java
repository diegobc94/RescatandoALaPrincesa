package tipos_grafos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import grafo.MatrizSimetrica;
import grafo.Nodo;

public class GrafoNDP {
	private MatrizSimetrica grafo;
	private int cantNodos;
	private int cantAristas;
	
	private ArrayList<Nodo> nodos = new ArrayList<Nodo>();
	private ArrayList<Nodo> nodosDragones = new ArrayList<Nodo>();
	private int[] pesosAristas;
	private int dragones;
	private int principe;
	private int princesa;
	
	public GrafoNDP(String path) throws FileNotFoundException {
		File file = new File(path);
		Scanner sc = new Scanner(file);
		this.cantNodos=sc.nextInt();
		this.cantAristas=sc.nextInt();
		this.dragones=sc.nextInt();
		this.principe=sc.nextInt();
		this.princesa=sc.nextInt();
		for(int i=0; i<this.dragones; i++)
			this.nodosDragones.add(new Nodo(sc.nextInt()));
		
		this.grafo = new MatrizSimetrica(this.cantNodos);
		
		this.pesosAristas = new int[(this.cantNodos*this.cantNodos-this.cantNodos)/2];
		
		for(int i=0; i<this.cantAristas; i++)
			this.pesosAristas[i]=0;
		
		for(int i=0; i<this.cantAristas; i++) {
			int fil = sc.nextInt()-1;
			int col = sc.nextInt()-1;
			int peso = sc.nextInt();
			int indice = this.grafo.getIndice(fil,col);
			this.pesosAristas[indice]=peso;
			this.grafo.ponerArista(indice);
		}
		
		
		sc.close();
	}
}
