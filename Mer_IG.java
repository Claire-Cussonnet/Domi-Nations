import org.newdawn.slick.*;

public class Mer extends BasicGame {
    public Mer(String title) {
        super("Mer");
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        int a = 1;
        int reponse = 0;
        int[] intTable = {1}; // CHOISIR LE NOMBRE DE COURONNES 1 ou 0
        graphics.setColor(Color.blue);
        graphics.fillRect(0,0,80,80); //Dessin du domino de base
        for (int i = 0; i < intTable.length; i++) { //BOUCLE FOR : permet de dessiner la couronne
            reponse = intTable[i];
            if (reponse == a) {
                graphics.setColor(Color.black);
                graphics.fillOval(20*i,5,15,15);
            }
        }

    }
}
