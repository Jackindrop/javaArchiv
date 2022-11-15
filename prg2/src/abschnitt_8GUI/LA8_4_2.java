package abschnitt_8GUI;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class LA8_4_2 extends Application {
    private StringProperty t = new SimpleStringProperty("");
    @Override public void start(Stage stage) {
        /**
         * Garbage Collector löscht keinen der Buttons pbwohl er nur den letzten benötigt.
         * Listener MÜSSEN mit removeListener explizit wieder enfernt werden
         * ----------------------------------------------------< sonst, SPEICHERLECK
         */
        Button lastButton= null;
        for (int i = 0; i < 1_000_0000 ; i++) {
            final Button button = new Button();
            t.addListener((obs, ov, nv) -> button.setText(nv) );
            lastButton= button;
        }
        Scene scene = new Scene(lastButton, 300, Region.USE_COMPUTED_SIZE);
        stage.setScene(scene);
        stage.show();
        t.set("Hello world");
    }
    public static void main(String[] args) {
        launch(args);
    }
}
