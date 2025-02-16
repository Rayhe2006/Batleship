import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * KeyController Class
 * Responds to the users keyboard
 * @since 01/24/2024
 * @author Rayhan.E (creator)
 */
public class KeyController implements KeyListener {
BattleshipModel model; //The game model
/**
 * Constructor for key controller
 * @author Rayhan.E
 * @param BattleshipModel model    the battleship model
 */
public KeyController(BattleshipModel model)
{
    this.model=model;
}
    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    /**
    * KeyListener for when a key is released
    * @author Rayhan.E
    * @param KeyEvent e    //The key event
    */
    @Override
    public void keyReleased(KeyEvent e) {
        //Checks if the keycode coresponds to the action and changes the model
        if (e.getKeyCode()==38) {
            this.model.movePlayerShip(this.model.getPlacingShipType(), "Up");
        } else if (e.getKeyCode()==40) {
            this.model.movePlayerShip(this.model.getPlacingShipType(), "Down");
        } else if (e.getKeyCode()==39) {
            this.model.movePlayerShip(this.model.getPlacingShipType(), "Right");
        } else if (e.getKeyCode()==37) {
            this.model.movePlayerShip(this.model.getPlacingShipType(), "Left");
        } else if (e.getKeyCode()==10||e.getKeyCode()==13) {
            this.model.placeShip(this.model.getPlacingShipType(),true,this.model.getPlayerShipPlacingGrid(),this.model.getPlayerShipGrid());
        } 
        else if(e.getKeyCode()==82)
        {
            this.model.changePlacingShipDirection();
        }        
    }
    
}
