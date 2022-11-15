package abschnitt_8GUI;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class LA8_4_2_dontListen_BINGING extends Application {
    private StringProperty t = new SimpleStringProperty("");

    @Override
    public void start(Stage stage) {
        Button lastButton = null;
        for (int i = 0; i < 1_000_000; i++) {
            final Button button = new Button();
            button.textProperty().bind(t);
            lastButton = button;
            if (i < 999_999) button.textProperty().unbind();
        }
        Scene scene = new Scene(lastButton);
        stage.setScene(scene);
        stage.show();
        t.set("Hello world");


    }

    public static void main(String[] args) {
        launch(args);
    }
}
