package abschnitt_8GUI;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

/**
 * 8f BINDINGS
 */

public class FactorsOfNumber_8f extends Application {

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

    //    tfNumb.textProperty().addListener((obs,ov,nv) -> checkInput());
        /**
         * textProb.Listener ersetzt durch Bindings
         */
        BooleanBinding inputOk= Bindings.createBooleanBinding(
            () -> tfNumb.getText().matches("[0-9]+"),
            tfNumb.textProperty());
        BooleanBinding notInputOk= inputOk.not();

        tfNumb.styleProperty().bind(
                Bindings.when(inputOk).then("")
                        .otherwise("-fx-focus-color: red;"));
        tfNumb.onActionProperty().bind(Bindings.createObjectBinding(
                () -> inputOk.getValue() ? handler : null,
                inputOk));
        lblStatus.textProperty().bind(
                Bindings.when(inputOk).then("")
                        .otherwise("Integer number expected"));

        btn.disableProperty().bind(notInputOk);

        Label lbl = new Label("Number");

        HBox hBox = new HBox(lbl, tfNumb, btn); // ersetzen durch FlowPane
        hBox.setSpacing(5);
        hBox.setAlignment(Pos.BASELINE_LEFT);
        hBox.setPadding(new Insets(5, 10, 5, 10));

        HBox.setHgrow(tfNumb, Priority.ALWAYS);
        HBox.setHgrow(lbl, Priority.NEVER);
        HBox.setHgrow(btn, Priority.NEVER);

        btn.setOnAction(handler);

        ScrollPane sp = new ScrollPane(lblResult);
        sp.setPrefSize(230, 140); // explizite bevorzugte Größe
        sp.setStyle("-fx-border-color: blue;"); // sichtbar machen

        BorderPane bp= new BorderPane();
        bp.setTop(hBox);
        bp.setCenter(sp);
        bp.setBottom(lblStatus);

        Scene scene = new Scene(bp, 400, 300);//px angabe entfällt dann an der stelle
        primeStage.setScene(scene);

        primeStage.setTitle("Factors");
        primeStage.show();

        System.out.println(scene.getWidth()+" x "+scene.getHeight());

    }

    public static void main(String[] args) {
        launch(args);
    }
}
