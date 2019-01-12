public class Joueur {

	public String nom;
	public String couleur;
	public int numero;

	// Pour chaque joueur on définit un numéro, un nom et une couleur
	public Joueur(int numero, String nom, String couleur) {
		this.numero = numero;
		this.nom = nom;
		this.couleur = couleur;

	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
