package fxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;


public class StartController {

    public void Start(ActionEvent event)throws IOException{
        FXMLLoader loader = new FXMLLoader();
        Parent BSI = loader.load(getClass().getResource("Interface.fxml"));

        Scene scene = new Scene(BSI);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();

    }
}
