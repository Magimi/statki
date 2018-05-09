package fxml;
import game.Shoot;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import game.Board;

import javafx.scene.control.SplitPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;


public class InterfaceController {
    private int x;
    private int y;
    public static int moves = 0;

    @FXML
    TextArea text = new TextArea();

    @FXML
    SplitPane pane = new SplitPane();

    @FXML
    public void initialize() {    }

    @FXML
    public void click(ActionEvent event) {
        moves++;
        x = (Integer.parseInt(((Button) event.getSource()).getText())) / 10;
        y = (Integer.parseInt(((Button) event.getSource()).getText())) % 10;

        if (Board.board2[x][y] == 'X') {
            text.setText("Nie możesz strzelić tutaj poraz drugi");
        }
        else if (Board.board1[x][y] == null) {
            text.setText("Pudło");
            ((Button) event.getSource()).setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, null, null)));
        }
        else if (Board.board1[x][y] != null) {
            ((Button) event.getSource()).setBackground(new Background(new BackgroundFill(Color.BLACK, null, null)));
            Shoot.Shoot1(x, y);
            text.setText(Shoot.texty);
        }
        if (Shoot.texty.equals("! WYGRALES W "+ InterfaceController.moves +" RUCHACH !")) {
            pane.setDisable(true);
        }
    }
}