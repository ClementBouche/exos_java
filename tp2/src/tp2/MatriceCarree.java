package tp2;

public class MatriceCarree {
	
	private double[][] M;
	private int size;
	
	
	/*** Constructeurs ***/
	
	public MatriceCarree() {
		this.size = 0;
	}
	public MatriceCarree(int dim) {
		this.size = dim;
		this.M = new double[size][size];		
	}
	public MatriceCarree(double[][] tab) {
		this.size = tab.length;
		this.M = new double[size][size];
		for(int i=0; i<size; i++) {
			for(int j=0; i<size; j++) {
				this.M[i][j] = tab[i][j];
			}
		}	
	}
	
	/*** Setters and Getters ***/
	public double elementAt(int i, int j) {
		return this.M[i][j];
	}
	public void setElementAt(double x, int i, int j) {
		this.M[i][j] = x;
	}
	
	
	/*** Opérations ***/
	
	//Addition
	public MatriceCarree add(MatriceCarree A){
		
		MatriceCarree C = new MatriceCarree(size);
		for (int i=0; i < size; i++) {
			for (int j=0; j < size; j++) {
				C.setElementAt(this.M[i][j] + A.elementAt(i,j), i, j);
			}
		}
	return C;
	}
	
	//Soustraction
	public MatriceCarree substract(MatriceCarree A){
		
		MatriceCarree C = new MatriceCarree(size);
		
		for (int i=0; i < size; i++) {
			for (int j=0; j < size; j++) {
				C.setElementAt(this.M[i][j]- A.elementAt(i,j), i, j);
			}
		}
	return C;
	}
	
	//Multiplication
	public MatriceCarree multiply(MatriceCarree A){

		MatriceCarree C = new MatriceCarree(size);
		double sum;
		for (int i=0; i < size; i++) {
			for (int j=0; j < size; j++) {
				sum = 0;
				for (int k=0; k<size; k++) {
					sum += this.M[i][k]*A.elementAt(k,j);
				}
				C.setElementAt(sum, i, j);
			}
		}
	return C;
	}
	
	
	/*** Matrices basiques ***/
	
	//Matrice nulle
	public static MatriceCarree zero(int size){
		MatriceCarree Z = new MatriceCarree(size);
		for (int i=0; i < size; i++) {
			for (int j=0; j < size; j++) {
				Z.setElementAt(0, i, j);
			}
		}
		return Z;
	}
	
	//Matrice unité
	public static MatriceCarree unite(int size){
		MatriceCarree Z = new MatriceCarree(size);
		for (int i=0; i < size; i++) {
			for (int j=0; j < size; j++) {
				if (i == j) {
					Z.setElementAt(1, i, j);
				}
				else {
					Z.setElementAt(0, i, j);
				}
			}
		}
		return Z;
	}
	
	
	/*** Affichage ***/
	public void affichage(){
		String line = "";
		for (int i=0; i < size; i++) {
			line = "";
			for (int j=0; j < size; j++) {
				line += " "+this.M[i][j];
			}
			System.out.println(line);
		}
		System.out.println("--------");
	}
	
	/*** Main ***/
	public static void main(String[] args) {
		MatriceCarree A = new MatriceCarree(2);
		A.setElementAt(15, 0, 0);
		A.setElementAt(10, 1, 0);
		A.setElementAt(-1, 0, 1);
		A.setElementAt(0, 1, 1);
		
		A.affichage();
		
		MatriceCarree B = MatriceCarree.unite(2);
		B.affichage();
		
		MatriceCarree C = A.substract(B);
		C.affichage();
	}
}
