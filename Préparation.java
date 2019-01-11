import java.util.*;
import java.io.*;

public class Preparation {

	public static void main(String[] args) {
		System.out.println("Liste de tous les dominos : ");
		FileReader myFile = null;
		BufferedReader init = null;

		try {
			myFile = new FileReader("/Users/clairecussonnet/Downloads/dominos.csv");
			init = new BufferedReader(myFile);

			while (true) {
				String ligne = init.readLine();
				if (ligne == null)
					break;
				System.out.println(ligne);
			} 
		} catch (IOException exception) {
			exception.printStackTrace();
		} finally {
			try {
				init.close();
				myFile.close();
			} catch (IOException exception1) {
				exception1.printStackTrace();
			}
		}
		System.out.println("Chaque joueur prend un chateau de couleur");
		System.out.println("Chaque joueur prend une tuile de départ");
		System.out.println("A combien jouez-vous?");
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if (n < 2) {
			System.out.println("Vous devez être minimmum 2 joueurs.");
		}
		if (n == 2) {
			System.out.println("Chaque joueur prend 2 rois de la couleur du chateau.");
			int r = 2;
			System.out.println("On prend les dominos numérotés avec les numéros de la liste suivante : ");
			ArrayList<Integer> list = new ArrayList<Integer>();
			int i = 1;
			int nb = 0;
			while (i < 25) {
				nb = (int) ((Math.random() * 47) + 1);
				if (!(list.contains(nb))) {
					list.add(nb);
					i++;
				}
			}
			System.out.println(list);

		}
		if (n == 3) {
			System.out.println("Chaque joueur prend 1 roi de la couleur du chateau.");
			int r =1;
			System.out.println("On prend les dominos numérotés avec les numéros de la liste suivante : ");
			ArrayList<Integer> list = new ArrayList<Integer>();
			int i = 1;
			int nb = 0;
			while (i < 37) {
				nb = (int) ((Math.random() * 47) + 1);
				if (!(list.contains(nb))) {
					list.add(nb);
					i++;
				}
			}
			System.out.println(list);
		}
		if (n == 4) {
			System.out.println("Chaque joueur prend 1 roi de la couleur du chateau.");
			int r =1;
			System.out.println("On prend tous les dominos");

		}
		if (n > 4) {
			System.out.println("Vous devez être 4 joueurs maximum.");
		}

	}

}
