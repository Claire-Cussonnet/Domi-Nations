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
		switch(n) {
		case 2 : 
			int it = 1;
			while(it < 3) {
				System.out.println("Tapez le nom du joueur " + it + " : ");
				String nomJoueur = scan.nextLine();
				String couleur = couleurs[it-1];
				addPlayer(playerList, it, nomJoueur, couleur);
				it++;
			}
			
			
			
			System.out.println("On va jouer avec 24 dominos");
			System.out.println(playerList.get(0).getNom() + " " + playerList.get(0).getCouleur() );
			System.out.println(playerList.get(1).getNom() + " " + playerList.get(1).getCouleur() );
			//k = 24;
			break;
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
			//k = 36;
			break;
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
			//k = 48;
			break;
		
		}
		
				
	}
	
	public static void addPlayer(ArrayList<Joueur> playerList, int numero, String nom, String couleur) {
		Joueur joueur = new Joueur(numero, nom, couleur);
		playerList.add(joueur);
	}

}
