package abschnitt_8GUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class FactorsOfNumber_8a extends Application {


    @Override
    public void start(Stage primeStage) {

        Label lbl = new Label("Number");
        TextField tfNumb = new TextField();
        Button btn = new Button("Calc");

        HBox hBox = new HBox();
        hBox.getChildren().addAll(lbl, tfNumb, btn);

        Label lblResult = new Label("Ergebniss: ");

        VBox root = new VBox();
        root.getChildren().addAll(hBox, lblResult);

        Scene scene = new Scene(root, 400, 300);
        primeStage.setScene(scene);

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                lblResult.setText("event handeld!");
            }
        });

        primeStage.setTitle("Factors");
        primeStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
