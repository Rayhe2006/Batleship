import javax.swing.*;
import java.awt.event.*;
public class StartController implements ActionListener {
    private BattleshipModel model;
    private JTextField roundsOfPlay;
    private JTextField gameNum;

    public StartController(BattleshipModel model, JTextField roundsOfPlay, JTextField gameNum) {
        this.model = model;
        this.roundsOfPlay = roundsOfPlay;
        this.gameNum = gameNum;
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (((JButton) (e.getSource())).getText().equals("Start Game")) {
                this.model.startGame(Integer.parseInt(this.roundsOfPlay.getText()));
            } else if (((JButton) (e.getSource())).getText().equals("Restart Game")) {
                this.model.restartGame();
            } else if (((JButton) (e.getSource())).getText().equals("View Old Game Stats")) {
                this.model.setGameState(this.model.STATE_SHOW_OLD_GAME_STATS);
                this.model.updateView();
                gameNum.setFocusable(true);
            }
            else if (((JButton) (e.getSource())).getText().equals("Exit")) {
                this.model.setGameState(this.model.STATE_START_GAME);
            }

        } catch (NumberFormatException f) {
            this.roundsOfPlay.selectAll();
            JOptionPane.showMessageDialog(null, "Please enter a valid number.", "Invalid Input",
                    JOptionPane.ERROR_MESSAGE);
        }
        
        
    }
}