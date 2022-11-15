package abschnitt_8GUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;


public class ClickCounter extends Application {

    private int cnt= 0;

    @Override public void start(Stage primaryStage) {
        Label lbl= new Label(cnt+" Clicks");
        Button btn= new Button("Click");

        btn.setOnAction((ActionEvent e) -> {
            cnt++;
            lbl.setText(cnt + " Clicks");
        });
        HBox root = new HBox(lbl, btn);
        Scene scene = new Scene(root, Region.USE_COMPUTED_SIZE,
                Region.USE_COMPUTED_SIZE);

        /** styling
        root.setStyle(
                "-fx-font: 30px Tahoma; -fx-spacing: " +
                        "10; -fx-alignment: center;" +
                        " -fx-padding: 20;");
         */
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}