package u30_FX_SuchDialog;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;
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
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.util.Scanner;

public class GrundVersetzt extends Application {
    private final TextField suchFeld = new TextField();
    private final Button btn = new Button("Suchen");
    private final Label suchErgenisse = new Label("");
    private final Label lblStatus= new Label("");
    private int rowCounter;
    private Label resultCounter  = new Label(0 + " Vorkommen");

    EventHandler<ActionEvent> handler= new EventHandler<ActionEvent>() {
        @Override public void handle(ActionEvent event) {
            String inputWord= suchFeld.getText();
            Scanner gesetz= null;
            String resultSearch= "";

            try {
                gesetz = new Scanner(new File("gg.txt"));

            } catch (Exception w) {}

            int sumHits= 0;
            rowCounter= 0;
            while (gesetz.hasNextLine()) {
                rowCounter++;
                String row= gesetz.nextLine();
                System.out.println("INPUT::"+ row);
                Scanner scanRow = new Scanner(row);
                while (scanRow.hasNext()) {
                    int hitCounter= 0;
                    String tmp= scanRow.next();
                    if (tmp.equals(inputWord)) {
                        hitCounter++;
                    }
                    if (hitCounter != 0) {
                        resultSearch+= rowCounter + ":("+ hitCounter + ""+ row+ "\n";

                    }
                    sumHits+= hitCounter;
                    hitCounter= 0;
                }
            }
            resultCounter.setText(sumHits + " Vorkommen");
            suchErgenisse.setText(resultSearch);
            gesetz.close();
        }
    };

    @Override
    public void start(Stage primeStage) {
        Label lbl = new Label("Wort: ");
        HBox hBox = new HBox(lbl, suchFeld, btn); // ersetzen durch FlowPane
        hBox.setSpacing(5);

        VBox vBox= new VBox(hBox, resultCounter);
        hBox.setSpacing(5);
        vBox.setAlignment(Pos.BASELINE_CENTER);
        vBox.setPadding(new Insets(20, 10, 15, 10));

        HBox.setHgrow(suchFeld, Priority.ALWAYS);
        HBox.setHgrow(lbl, Priority.NEVER);
        HBox.setHgrow(btn, Priority.NEVER);

        btn.setOnAction(handler);
        suchFeld.setOnAction(handler);

        ScrollPane sp = new ScrollPane(suchErgenisse);

        BorderPane bp= new BorderPane();
        bp.setTop(vBox);
        bp.setCenter(sp);
        bp.setBottom(lblStatus);

        Scene scene = new Scene(bp, 400, 300);//px angabe entfällt dann an der stelle

        resultCounter.setStyle(
                "-fx-font: 30px Tahoma;");
        hBox.setStyle(
                "-fx-font: 15px Nimbus; -fx-spacing: " +
                        "10; -fx-alignment: center;");

        primeStage.setScene(scene);
        primeStage.setTitle("Grundgesetz");
        primeStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
