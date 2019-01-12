import java.util.*;

public class Game {
	


	public static void main(String[] args) {
		
		String[] couleurs = {"Pink","Yellow", "Blue", "Green"};
		
		// Initialisation liste des joueurs
		ArrayList<Joueur> playerList = new ArrayList<>();

		int n = 0;
		Scanner scan = new Scanner(System.in);
		while((n<2)||(n>4)) {
			System.out.println("Voulez-vous jouer à 2,3 ou 4 joueurs ?"); //On demande à combien de joueurs ils souhaitent jouer
			n = scan.nextInt(); //n = nombre de joueurs
			scan.nextLine();
		}
		
		//On crée une liste de dominos
		ArrayList<Domino> dominos = createDominos();

		switch(n) {
		//S'il y a 2 joueurs 
		case 2 : 
			int it = 1;
			while(it < 3) {
				//On rentre le nom des joueurs
				System.out.println("Tapez le nom du joueur " + it + " : ");
				String nomJoueur = scan.nextLine();
				//On attribue une couleur aux joueurs
				String couleur = couleurs[it-1];
				addPlayer(playerList, it, nomJoueur, couleur);
				it++;
						
			}
			
			System.out.println("On va jouer avec 24 dominos");
			//On affiche le nom du joueur et sa couleur
			System.out.println(playerList.get(0).getNom() + " " + playerList.get(0).getCouleur() );
			System.out.println(playerList.get(1).getNom() + " " + playerList.get(1).getCouleur() );
			
			//On mélange la liste des dominos
			Collections.shuffle(dominos);
			
			//On prend les 24 premiers dominos mélangés
			ArrayList<Domino> domino2 = new ArrayList<>();
			for (int i=0; i<24; i++) {
				domino2.add(dominos.get(i));
				System.out.println(dominos.get(i).getCellule1().numero + " " + dominos.get(i).getCellule1().type + " " + dominos.get(i).getCellule2().type);
			}
			break;
		//S'il y a 3 joueurs, on fait pareil que pour 2 mais avec 3 noms de joueurs à saisir et 36 dominos sélectionnés aléatoirement 
		case 3 : 
			int i = 1;
			while(i < 4) {
				System.out.println("Tapez le nom du joueur " + i + " : ");
				String nomJoueur = scan.nextLine();
				String couleur = couleurs[i-1];
				addPlayer(playerList, i, nomJoueur, couleur);
				i++;
			}
			
			System.out.println("On va jouer avec 36 dominos");
			System.out.println(playerList.get(0).getNom() + " " + playerList.get(0).getCouleur() );
			System.out.println(playerList.get(1).getNom() + " " + playerList.get(1).getCouleur() );
			System.out.println(playerList.get(2).getNom() + " " + playerList.get(2).getCouleur() );
			
			Collections.shuffle(dominos);
			
			ArrayList<Domino> domino3 = new ArrayList<>();
			for (int t=0; t<36; t++) {
				domino3.add(dominos.get(t));
				System.out.println(dominos.get(t).getCellule1().numero + " " + dominos.get(t).getCellule1().type + " " + dominos.get(t).getCellule2().type);
			}
			
			break;
		//S'il y a 4 joueurs on fait pareil qu'avec 2 joueurs mais avec 4 noms de joueurs à saisir et les 48 dominos mélangés
		case 4 : 
			int j = 1;
			while(j < 5) {
				System.out.println("Tapez le nom du joueur " + j + " : ");
				String nomJoueur = scan.nextLine();
				String couleur = couleurs[j-1];
				addPlayer(playerList, j, nomJoueur, couleur);
				j++;
			}

			System.out.println("On va jouer avec 48 dominos");
			System.out.println(playerList.get(0).getNom() + " " + playerList.get(0).getCouleur() );
			System.out.println(playerList.get(1).getNom() + " " + playerList.get(1).getCouleur() );
			System.out.println(playerList.get(2).getNom() + " " + playerList.get(2).getCouleur() );
			System.out.println(playerList.get(3).getNom() + " " + playerList.get(3).getCouleur() );
			
			Collections.shuffle(dominos);
			
			ArrayList<Domino> domino4 = new ArrayList<>();
			for (int f=0; f<48; f++) {
				domino4.add(dominos.get(f));
				System.out.println(dominos.get(f).getCellule1().numero + " " + dominos.get(f).getCellule1().type + " " + dominos.get(f).getCellule2().type);
			}
			
			break;
		
		}
		
		
		
				
	}
	
	//On crée une liste dans laquelle on va ajouter les joueurs avec leur numéro, leur nom et leur couleur
	public static void addPlayer(ArrayList<Joueur> playerList, int numero, String nom, String couleur) {
		Joueur joueur = new Joueur(numero, nom, couleur);
		playerList.add(joueur);
	}
	
	//On crée une liste de dominos à partir du fichier CSV
	public static ArrayList<Domino> createDominos() {
		ArrayList<Domino> dominos = new ArrayList<>();
		ArrayList<Cellule> cellules = Domino.getCellsFromCsv();
		
		while (cellules.size() !=0) {
			Cellule marqueur = cellules.get(0);
			for (int j=1; j< cellules.size();j++) {
				if (cellules.get(j).getNumero() == marqueur.getNumero()) {
					Domino domino = new Domino(marqueur, cellules.get(j));
					dominos.add(domino);
					cellules.remove(j); 
					cellules.remove(0);
					break;
				}
			}
		}
		return dominos;
	}

}
