package abschnitt_8GUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class CCuebung extends Application {

    public int cnt= 0;
    @Override
    public void start(Stage pM) {
        Label cntTxt = new Label("0 Clicks");
        Button btn = new Button("ClickUp");
        Button btn2 = new Button("ClickDown");
        Button gB = new Button("Gear");
        VBox vb = new VBox(btn, gB, btn2);
        HBox root = new HBox(cntTxt, vb);

        btn.setOnAction(actionEvent -> {
            btn2.setDisable(true);
            cnt++;
            cntTxt.setText(cnt+ " Clicks");
        });
        btn2.setOnAction(actionEvent -> {
            btn.setDisable(true);
            cnt--;
            cntTxt.setText(cnt+ " Clicks");
        });
        gB.setOnAction(actionEvent -> {
            if (btn2.isDisabled()) {
                btn2.setDisable(false);
                btn.setDisable(true);
            } else if (btn.isDisabled()) {
                btn2.setDisable(true);
                btn.setDisable(false);
            }
        });

        root.setStyle("-fx-padding: 20;"+
                "-fx-alignment: center;"+
                "-fx-spacing: 20");

        Scene scene = new Scene(root);
        pM.setScene(scene);
        pM.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
