import org.newdawn.slick.*;

public class Mine extends BasicGame {
    public Mine(String title) {
        super("Mine");
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
        int[] intTable = {1}; // CHOISIR LE NOMBRE DE COURONNES 1 ou 0, POUR DEUX COURONNES A REDIGER AINSI : int[] intTable = {1;1}
        graphics.setColor(Color.lightGray);
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
