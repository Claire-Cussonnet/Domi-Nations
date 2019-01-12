import org.newdawn.slick.*;

public class Roi extends BasicGame {
    public Roi(String title) {
        super("Roi");
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        /**
         * Il nous faut quatre rois, il suffit simplement de changer la couleur de celui-ci
         */
        graphics.setColor(Color.pink); //CHANGEMENT DE LA COULEUR
        graphics.drawRect(0,0,80,80);
    }
}
