import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

public class MainIG {
    public static void main(String[] args){
        try {
            AppGameContainer apg = new AppGameContainer(new Foret("game"));
            apg.setDisplayMode(720,720,false);
            apg.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
