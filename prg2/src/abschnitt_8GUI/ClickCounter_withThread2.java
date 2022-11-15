package abschnitt_8GUI;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.stage.Stage;


public class ClickCounter_withThread2 extends Application {

    private int cnt= 0;

    @Override public void start(Stage primaryStage) {
        Label lbl= new Label(cnt+" Clicks");
        Button btn= new Button("Click");
        /**
         * Curser wird als sanduhr gezeigt.
         * Handler kann aber nix zurück an den scene-graphen geben
         * ---> Platform.runLater
         */
        btn.setOnAction(event -> {
            lbl.getScene().setCursor(Cursor.WAIT);
            Thread ht= new Thread ( () -> {
                for (long i=0; i<10_000_000_000L; i++);
                cnt++;

                Platform.runLater( () -> {
                    lbl.setText(cnt + " Clicks");
                    lbl.getScene().setCursor(Cursor.DEFAULT);
                });

            });
            ht.start();
            // Thread zuscheißen
        //    for (long i=0; i<10_000_000_000L; i++);
            cnt++;
            lbl.setText(cnt + " Clicks");
        });
        HBox root = new HBox(lbl, btn);
        Scene scene = new Scene(root, 300,
                Region.USE_COMPUTED_SIZE);

        // styling
        root.setStyle(
                "-fx-font: 30px Tahoma; -fx-spacing: " +
                        "10; -fx-alignment: center;" +
                        " -fx-padding: 20;");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}