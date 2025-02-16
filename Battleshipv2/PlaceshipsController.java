import java.awt.event.*;

/**
 * PlaceshipsController Class
 * Manages placing ships using buttons
 * Probably not used anymore
 * Last Modified: 01/22/2024
 * @author Rayhan E.
 */
public class PlaceshipsController implements ActionListener {
    private BattleshipModel model;
    ShipGrid grid;

    /** Creates a new PlaceshipsController
    * @param model the BattleshipModel
    * @param grid the Grid to place the ship on
    */
    public PlaceshipsController(BattleshipModel model, ShipGrid grid) {
        this.model = model;
        this.grid = grid;
    }

     /** Runs code on button press
     * @param e The button pressed
     */
    public void actionPerformed(ActionEvent e) {
        //System.out.println(counter);
        //(e.getActionCommand().equals("Create Name"))
        // (((JButton) (e.getSource())).getText().equals("Up"))
        if (e.getActionCommand().equals("Up")) {
            this.model.movePlayerShip(this.model.getPlacingShipType(), "Up");
        } else if (e.getActionCommand().equals("Down")) {
            this.model.movePlayerShip(this.model.getPlacingShipType(), "Down");
        } else if (e.getActionCommand().equals("Right")) {
            this.model.movePlayerShip(this.model.getPlacingShipType(), "Right");
        } else if (e.getActionCommand().equals("Left")) {
            this.model.movePlayerShip(this.model.getPlacingShipType(), "Left");
        } else if (e.getActionCommand().equals("Place Ship")) {
            this.model.placeShip(this.model.getPlacingShipType(), true, this.model.getPlayerShipPlacingGrid(),this.model.getPlayerShipGrid());
        } else if (e.getActionCommand().equals("Change Direction")) {
            this.model.changePlacingShipDirection();
        }
    }
}