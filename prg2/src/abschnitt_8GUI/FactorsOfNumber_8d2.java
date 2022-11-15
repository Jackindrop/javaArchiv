package abschnitt_8GUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;


public class FactorsOfNumber_8d2 extends Application {

    private TextField tfNumb = new TextField();
    private Button btn = new Button("Cal_culate");
    private Label lblResult = new Label("Result: ");
    private Label lblStatus= new Label("");

    EventHandler<ActionEvent> handler= new EventHandler<ActionEvent>() {
        @Override public void handle(ActionEvent event) {
            StringBuilder sb= new StringBuilder("Result:");
            long n= Long.parseLong(tfNumb.getText());

            for (long i=2; i<=n/2; i++) {
                if (n % i == 0) sb.append("\n").append(i);
            }

            lblResult.setText(sb.toString());
        }
    };

    @Override
    public void start(Stage primeStage) {
        /** add Tooltip
        tfNumb.setTooltip(new Tooltip("Enter an integer number, please"));
        btn.setTooltip(new Tooltip("Start calculation of factors"));
        btn.setMnemonicParsing(true); */ //<-----------------------notWORKING

        tfNumb.setOnKeyReleased( event -> checkInput() );
        checkInput();

        Label lbl = new Label("Number");
        Button btn = new Button("Calculate");

        HBox hBox = new HBox(lbl, tfNumb, btn); // ersetzen durch FlowPane
     // FlowPane flowPane= new FlowPane(Orientation.HORIZONTAL);
        hBox.setSpacing(5);
        hBox.setAlignment(Pos.BASELINE_LEFT);
        hBox.setPadding(new Insets(5, 10, 5, 10));

        HBox.setHgrow(tfNumb, Priority.ALWAYS);
        HBox.setHgrow(lbl, Priority.NEVER);
        HBox.setHgrow(btn, Priority.NEVER);

        btn.setOnAction(handler);
        tfNumb.setOnAction((handler));
         // einmal zu Beginn checken

        ScrollPane sp = new ScrollPane(lblResult);
        sp.setPrefSize(230, 140); // explizite bevorzugte Größe
        sp.setStyle("-fx-border-color: blue;"); // sichtbar machen
     //   lblResult.setAlignment(Pos.TOP_LEFT);   // "Ergebnisse:" nach oben links deffinieren
     //   Label lblStatus= new Label("");

        BorderPane bp= new BorderPane();
        bp.setTop(hBox);
        bp.setCenter(sp);
        bp.setBottom(lblStatus);

        //VBox root = new VBox(hBox, sp);

        Scene scene = new Scene(bp, 400, 300);//px angabe entfällt dann an der stelle
        primeStage.setScene(scene);

        primeStage.setTitle("Factors");
        primeStage.show();

        System.out.println(scene.getWidth()+" x "+scene.getHeight());

    }

    private void checkInput() {
        if (tfNumb.getText().matches("[0-9]+")) {
            tfNumb.setStyle("");
            lblStatus.setText("");

            btn.setDisable(false);
            tfNumb.setOnAction(handler);

        } else {
            lblStatus.setText("Integer number expected");
            tfNumb.setStyle("-fx-focus-color: red;");

            btn.setDisable(true); // "ausgrauen"
            tfNumb.setOnAction(null); // deaktivieren
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
