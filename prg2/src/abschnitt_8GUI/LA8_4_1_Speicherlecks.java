package abschnitt_8GUI;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class LA8_4_1_Speicherlecks extends Application {
    /**
     * Registriere Listener bei Properties
     *
     */
    private StringProperty t = new SimpleStringProperty("");
    @Override public void start(Stage stage) {
        final Button button = new Button();
        /**
         * referenz des button an listener,
         * Listener verwendet Button als umhüllende Methode
         */
        t.addListener((obs, ov, nv) -> button.setText(nv) );
        Scene scene = new Scene(button, 300, Region.USE_COMPUTED_SIZE);
        stage.setScene(scene);
        stage.show();
        t.set("Hello world");
    }
    public static void main(String[] args) {
        launch(args);
    }
}
