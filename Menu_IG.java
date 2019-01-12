import java.awt.Font;
import org.newdawn.slick.*;

public class Menu extends BasicGame {
    private int playersChoice = 0; //implémentation de la variable PlayersChoice qui définira le choix que le joueur effectuera
    private static final int NOCHOICES = 4;
    private static final int JOUEUR2 = 0;
    private static final int JOUEUR3 = 1;
    private static final int JOUEUR4 = 2;
    private static final int QUIT = 3;
    private String[] playersOptions = new String[NOCHOICES];
    private boolean exit = false;
    private Font font;
    private TrueTypeFont playersOptionsTTF, foo;
    private Color notChosen = new Color(153, 204, 255);

    public Menu() {
        super("Domi'Nation Menu");
    }

    @Override
    /**
     * Permet de définir le menu, plus exactement les 4 choix possibles : 2 joueurs, 3 joueurs, 4 joueurs et quitter
     */
    public void init(GameContainer gc) throws SlickException {
        font = new Font("Verdana", Font.BOLD, 40);
        playersOptionsTTF = new TrueTypeFont(font, true);
        font = new Font ("Verdana", Font.PLAIN, 20);
        foo = new TrueTypeFont(font, true);
        playersOptions[0] = "2 joueurs";
        playersOptions[1] = "3 joueurs";
        playersOptions[2] = "4 joueurs";
        playersOptions[3] = "Quitter";
    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        Input input = gc.getInput();
        /**
         * Permet de faire défiler le choix dans le menu avec les fléches haut et bas. Et permet de aussi de sélectionner son choix en appuyant sur entrée
         */
        if (input.isKeyPressed(Input.KEY_DOWN)) {
            if (playersChoice == (NOCHOICES - 1)) {
                playersChoice = 0;
            } else {
                playersChoice++;
            }
        }
        if (input.isKeyPressed(Input.KEY_UP)) {
            if (playersChoice == 0) {
                playersChoice = NOCHOICES - 1;
            } else {
                playersChoice--;
            }
        }
        if (input.isKeyPressed(Input.KEY_ENTER)) {
            switch (playersChoice) {
                case QUIT:
                    exit = true;
                    break;
            }
        }
    }

    @Override
    /**
     * Permet de relier les différents choix à l'algorithme de préparation afin de lancer le jeu en fonction du nbr de joueurs
     */
    public void render(GameContainer gc, Graphics g) throws SlickException {
        renderPlayersOptions();
        if (exit) {
            gc.exit();
        }
    }

    /**
     *
     * @param args
     * @throws SlickException
     * Permet de créer la fenêtre dans laquelle se trouvera le menu
     */
    public static void main(String[] args)
            throws SlickException {
        AppGameContainer app = new AppGameContainer(new Menu());
        app.setDisplayMode(800, 600, false);
        app.start();
    }

    /**
     * Permet d'afficher le texte à des coordonnées précises
     */
    private void renderPlayersOptions() {
        for (int i = 0; i < NOCHOICES; i++) {
            if (playersChoice == i) {
                playersOptionsTTF.drawString(100, i * 50 + 200, playersOptions[i]);
            } else {
                playersOptionsTTF.drawString(100, i * 50 + 200, playersOptions[i], notChosen);
            }
        }
    }
}
