import org.newdawn.slick.*;

public class Chateau extends BasicGame {
    public Chateau(String title) {
        super("Chateau");
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.setColor(Color.gray);
        graphics.drawRect(0,0,80,80);

    }
}
