package u30_FX_SuchDialog;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Box extends Application {
    public static Scanner input;

    static {
        try {
            input = new Scanner(new File("gg.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {launch(args);}

    @Override
    public void start(Stage primaryStage) {
        int vorkommen= 0;

        Label lbl= new Label("Wort:");
        TextField ergebnissFeld= new TextField(vorkommen+ " Vorkommen");
        Text mengeErgnisse = new Text();
        Button suchBtn= new Button("Suchen");
        Label lblResult= new Label("Result:");

        EventHandler<ActionEvent> handler= event -> {
            StringBuilder sb= new StringBuilder("Result:");
            long n= Long.parseLong(ergebnissFeld.getText());
            for (long i=2; i<=n/2; i++) {
                if (n % i == 0) sb.append("\n").append(i);
            }
            lblResult.setText(sb.toString());
        };
        suchBtn.setOnAction(handler);
        HBox inp= new HBox();
        inp.getChildren().addAll(mengeErgnisse, lbl, ergebnissFeld, suchBtn);
        ScrollPane sp= new ScrollPane(lblResult);
        sp.setPrefSize(230, 70);
        sp.setStyle("-fx-border-color: blue;");
        VBox.setVgrow(sp, Priority.ALWAYS);
        VBox root = new VBox(inp, sp);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Grundgesetz");
        primaryStage.show();
    }

    public Formatter getResult(Scanner in) {

        return new Formatter();
    }
}
