import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class main extends Application {

    public static void main(String[] args) {
        game.Board.InitialBoard();

        game.Board.Ships1Placement();
        game.Board.Ships2Placement();
        game.Board.Ships3Placement();
        game.Board.Ships4Placement();

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation((getClass().getResource("/fxml/Start.fxml")));
        GridPane pane = loader.load();

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Battleships");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}