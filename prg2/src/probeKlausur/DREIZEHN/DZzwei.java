package probeKlausur.DREIZEHN;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class DZzwei extends Application {

    @Override
    public void start(Stage pM) {
        Button bl = new Button("Hü");
        Button br = new Button("Hott");
        HBox root = new HBox(bl, br);
        Scene scene = new Scene(root);

        bl.setOnAction(actionEvent -> {
            bl.setDisable(true);
            br.setDisable(false);
        });
        br.setOnAction(actionEvent -> {
            bl.setDisable(false);
            br.setDisable(true);
        });

        pM.setScene(scene);
        pM.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
