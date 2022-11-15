package probeKlausur.DREIZEHN;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class DreiZehn extends Application {
    Button btn1 = new Button("Hü");
    Button btn2 = new Button("Hot");

    EventHandler e= new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {
            btn2.setDisable(false);
            btn1.setDisable(true);
        }
    };

    EventHandler ee= new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {
            btn2.setDisable(false);
            btn1.setDisable(true);
        }
    };

    @Override
    public void start(Stage primaryStage) {
        HBox root = new HBox();

        btn1.setOnAction(e);
        btn2.setOnAction(ee);
        root.getChildren().addAll(btn1, btn2);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
