import javax.swing.*;
import java.awt.event.*;

/**
 * OldGameStats Class
 * Class responsible to responding for the users actions when the oldGameStats panel is shown
 * @since 01/24/2024
 * @author Rayhan.E (creator)
 */
public class OldGameStats implements ActionListener {
    private BattleshipModel model; //The battleship model
    private JTextField gameNum; //Which game stat file the user wants to view

    /**
    * Constructor OldGameStats controller
    * @author Rayhan.E
    * @param BattleshipModel model    the battleship model
    * @param JTextField gameNum   Which game stat file the user wants to view
    */
    public OldGameStats(BattleshipModel model, JTextField gameNum) {
        this.model = model;
        this.gameNum = gameNum;
    }

    /**
    * Action performed method, which responds to actions
    * @author Rayhan.E
    * @param ActionEvent e    The action performed by the user
    */
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Exit")) {
            this.model.setGameState(this.model.STATE_START_GAME);
        } else {
            //Sets the old game stats to the game num
            this.model.setOldGameStats(Integer.parseInt(this.gameNum.getText()));
            //Clears the text field
            this.gameNum.setText("");
        }

    }
}