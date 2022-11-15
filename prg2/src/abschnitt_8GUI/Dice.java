package abschnitt_8GUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Random;

public class Dice extends Application {
    private Random rnd = new Random();
    @Override
    public void start(Stage pM) throws Exception {
        Label lb = new Label(Integer.toString(rnd.nextInt(6)+1));
        Button b = new Button("Dice");
        VBox root = new VBox(lb, b);
        Scene scene = new Scene(root);

        b.setOnAction(actionEvent -> {
            lb.setText(Integer.toString(rnd.nextInt(6)+1));
        });

        pM.setScene(scene);
        pM.show();
    }
}
