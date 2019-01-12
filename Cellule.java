import java.util.ArrayList;

public class Cellule {

	public String type;
	public int nbCouronne;
	public int numero;

	// Crée des cellules avec un type, un nombre de couronnes et un numéro
	public Cellule(String type, int nbCouronne, int numero) {
		this.type = type;
		this.nbCouronne = nbCouronne;
		this.numero = numero;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNbCouronne() {
		return nbCouronne;
	}

	public void setNbCouronne(int nbCouronne) {
		this.nbCouronne = nbCouronne;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	ArrayList<Cellule> cellules = new ArrayList<>();

	public static void createCellule(ArrayList<Cellule> cellules, Cellule cellule) {
	}

}

