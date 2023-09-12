package jurassicpark;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.stage.*;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage window) {
        window.setTitle("Jurassic Park Computer Screen");

        StackPane layout = new StackPane();

        Scene scene = new Scene(layout, 300, 300, Color.BLUE);

        window.setScene(scene);

        window.show();
    }
}
