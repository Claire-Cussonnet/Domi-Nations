import java.util.*;

public class Game {
	


	public static void main(String[] args) {
		
		String[] couleurs = {"pink","red", "blue", "green"};
		
		// Initialisation liste des joueurs
		ArrayList<Joueur> playerList = new ArrayList<>();

		
		System.out.println("Voulez-vous jouer à 2,3 ou 4 joueurs ?"); //On demande à combien de joueurs ils souhaitent jouer
		Scanner scan = new Scanner(System.in);
		String n = scan.nextLine(); //n = nombre de joueurs
		switch(n) {
		case "2" : 
			
			int it = 1;
			while(it < 3) {
				System.out.println("Tapez le nom du joueur " + it + " : ");
				String nomJoueur = scan.nextLine();
				String couleur = couleurs[it-1];
				addPlayer(playerList, it, nomJoueur, couleur);
				it++;
			}
			
			
			
			System.out.println("On va jouer avec 24 dominos");
			System.out.println(playerList.get(0).nom);
			System.out.println(playerList.get(1).nom);
			//k = 24;
			break;
/*		case "3" : 
			System.out.println("Tapez le nom du joueur 3 : ");
			String nomJoueur3 = scan.nextLine();
			
			System.out.println("On va jouer avec 36 dominos");
			k = 36;
			break;
			*/
		case "4" : 
			int j = 1;
			while(j < 5) {
				System.out.println("Tapez le nom du joueur " + j + " : ");
				String nomJoueur = scan.nextLine();
				String couleur = couleurs[j-1];
				addPlayer(playerList, j, nomJoueur, couleur);
				j++;
			}

			System.out.println("On va jouer avec 48 dominos");
			System.out.println(playerList.get(0).nom);
			System.out.println(playerList.get(1).nom);
			System.out.println(playerList.get(2).nom);
			System.out.println(playerList.get(3).nom);
			//k = 48;
			break;
		
		default :
			System.out.println("Le nombre saisi n'est pas valide");
			System.out.println("Ressaisissez un nombre");
			
			*/
		}
		
				
	}
	
	public static void addPlayer(ArrayList<Joueur> playerList, int numero, String nom, String couleur) {
		Joueur joueur = new Joueur(numero, nom, couleur);
		playerList.add(joueur);
	}

}
