package grafo;

public class MatrizSimetrica {
	private boolean[] matrizSimetrica;
	private int ordenMatriz;
	private int dimVector;
	
	public MatrizSimetrica(int ordenMatriz) {
		this.ordenMatriz=ordenMatriz;
		this.dimVector=(ordenMatriz*ordenMatriz-ordenMatriz)/2;
		this.matrizSimetrica=new boolean[this.dimVector];
		for(int i=0; i<this.dimVector; i++)
			this.matrizSimetrica[i]=false;
	}
	
	

	public boolean[] getMatrizSimetrica() {
		return matrizSimetrica;
	}

	public void setMatrizSimetrica(boolean[] matrizSimetrica) {
		this.matrizSimetrica = matrizSimetrica;
	}

	public int getOrdenMatriz() {
		return ordenMatriz;
	}

	public void setOrdenMatriz(int ordenMatriz) {
		this.ordenMatriz = ordenMatriz;
	}

	public int getDimVector() {
		return dimVector;
	}

	public void setDimVector(int dimVector) {
		this.dimVector = dimVector;
	}
	
	
	
	
	
}
