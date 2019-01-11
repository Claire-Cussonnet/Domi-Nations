import java.util.*;

public class Game {

	public static void main(String[] args) {
		System.out.println("Voulez-vous jouer à 2,3 ou 4 joueurs ?"); //On demande à combien de joueurs ils souhaitent jouer
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); //n = nombre de joueurs
		int k = 0;
		String Joueurs = scan.nextLine();
		switch(Joueurs) {
		case "2" : 
			System.out.println("On va jouer avec 24 dominos");
			k = 24;
			break;
		case "3" : 
			System.out.println("Tapez le nom du joueur 3 : ");
			String nomJoueur3 = scan.nextLine();
			
			System.out.println("On va jouer avec 36 dominos");
			k = 36;
			break;
		case "4" : 
			System.out.println("Tapez le nom du joueur 3 : ");
			String nomJoueur3 = scan.nextLine();
			
			System.out.println("Tapez le nom du joueur 4 : ");
			String nomJoueur4 = scan.nextLine();
			
			System.out.println("On va jouer avec 48 dominos");
			k = 48;
			break;
		
		default :
			System.out.println("Le nombre saisi n'est pas valide");
			System.out.println("Ressaisissez un nombre");
			
			
		}
		
		// try catch à faire
		System.out.println("Tapez le nom du joueur 1 : ");
		String nomJoueur1 = scan.nextLine();
		
		// try catch à faire
		System.out.println("Tapez le nom du joueur 2 : ");
		String nomJoueur2 = scan.nextLine();
		
	}

}
