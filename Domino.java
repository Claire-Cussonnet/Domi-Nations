import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Domino {

	// On définit 2 cellules qui correspondront aux différents types de terrain pour
	// chaque domino
	Cellule cellule1;
	Cellule cellule2;

	public Domino(Cellule cellule1, Cellule cellule2) {
		super();
		this.cellule1 = cellule1;
		this.cellule2 = cellule2;
	}

	public Cellule getCellule1() {
		return cellule1;
	}

	public void setCellule1(Cellule cellule1) {
		this.cellule1 = cellule1;
	}

	public Cellule getCellule2() {
		return cellule2;
	}

	public void setCellule2(Cellule cellule2) {
		this.cellule2 = cellule2;
	}

	public static void addCellule(ArrayList<Cellule> cellules, Cellule cellule) {
		cellules.add(cellule);
	}

	// Crée la premiere cellule
	public static Cellule createCellFromLine1(String lineFromFile1) {
		String[] split = lineFromFile1.split(",");
		int nbCouronne = Integer.parseInt(split[0]);
		String type = split[1];
		int numero = Integer.parseInt(split[4]);

		Cellule cellule = new Cellule(type, nbCouronne, numero);

		return cellule;
	}

	// Crée la deuxieme celulle
	public static Cellule createCellFromLine2(String lineFromFile2) {
		String[] split = lineFromFile2.split(",");
		int nbCouronne = Integer.parseInt(split[2]);
		String type = split[3];
		int numero = Integer.parseInt(split[4]);

		Cellule cellule = new Cellule(type, nbCouronne, numero);

		return cellule;
	}

	// Récupère la liste des cellules dans le fichier CSV
	public static ArrayList<Cellule> getCellsFromCsv() {
		ArrayList<Cellule> cellules = new ArrayList<>();
		BufferedReader buff = null;
		String ligne = null;
		try {
			buff = new BufferedReader(new FileReader("/Users/clairecussonnet/Downloads/dominos.csv"));

		} catch (FileNotFoundException exc) {
			System.out.println("Erreur d'ouverture");
		}
		try {
			boolean headline = true;
			while ((ligne = buff.readLine()) != null) {

				if (!headline) {
					Cellule cellule1 = createCellFromLine1(ligne);
					Cellule cellule2 = createCellFromLine2(ligne);
					cellules.add(cellule1);
					cellules.add(cellule2);

				} else
					headline = false;
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			buff.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return cellules;
	}

}
