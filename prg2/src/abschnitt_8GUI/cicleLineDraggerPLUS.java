package abschnitt_8GUI;
import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Locale;

/**
 * JavaFX How to handle Shape drag and drop events
 */
public class cicleLineDraggerPLUS extends Application {

    double orgSceneX, orgSceneY;
    public static Text text;

    private void updateText(Circle c) {
        text.setFont(Font.font("Arial", FontWeight.BOLD, 36));
        text.setFill(Color.WHITE);
        text.setStroke(Color.GOLD);

        text.setText(String.format(Locale.US, "(%.1f, %.1f)",
                c.getCenterX(), c.getCenterY()));
    }

    private Circle createCircle(double x, double y, double r, Color color) {
        Circle circle = new Circle(x, y, r, color);
        updateText(circle);
        circle.setCursor(Cursor.HAND);

        circle.setOnMousePressed((MouseEvent t) -> {
            orgSceneX = t.getSceneX();
            orgSceneY = t.getSceneY();
            updateText(circle);
            Circle c = (Circle) (t.getSource());
        });
        circle.setOnMouseDragged((t) -> {
            double offsetX = t.getSceneX() - orgSceneX;
            double offsetY = t.getSceneY() - orgSceneY;
            updateText(circle);
            Circle c = (Circle) (t.getSource());

            c.setCenterX(c.getCenterX() + offsetX);
            c.setCenterY(c.getCenterY() + offsetY);

            orgSceneX = t.getSceneX();
            orgSceneY = t.getSceneY();
        });

        return circle;
    }

    private Line connect(Circle c1, Circle c2) {
        Line line = new Line();
        line.startXProperty().bind(c1.centerXProperty());
        line.startYProperty().bind(c1.centerYProperty());
        line.endXProperty().bind(c2.centerXProperty());
        line.endYProperty().bind(c2.centerYProperty());
        line.setStrokeWidth(1);
        line.setStrokeLineCap(StrokeLineCap.BUTT);
        line.getStrokeDashArray().setAll(1.0, 4.0);

        return line;
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.initStyle(StageStyle.TRANSPARENT);
        StackPane stackPane = new StackPane();

        text = new Text(30, 690, "");
        Group root = new Group(stackPane, text);
        Scene scene = new Scene(root, 1280, 720);
        scene.setFill(Color.TRANSPARENT);


        Circle redCircle;
        redCircle = createCircle(593, 324, 60, Color.RED);
        Circle blueCircle = createCircle(593, 324, 90, Color.BLUE);
        Circle greenCircle = createCircle(593, 324, 120, Color.GREEN);
        DraggableCirclePLUS dCircle= new DraggableCirclePLUS(593.0, 324.0);

        Line line1 = connect(redCircle, blueCircle);
        Line line2 = connect(redCircle, greenCircle);
        Line line3 = connect(greenCircle, blueCircle);
        Line lineM1 = connect(redCircle, dCircle);
        Line lineM2 = connect(greenCircle, dCircle);
        Line lineM3 = connect(blueCircle, dCircle);

        // add the circles
        root.getChildren().addAll(blueCircle, redCircle, greenCircle,dCircle);
        // add the lines
        root.getChildren().addAll(line1,line2,line3,lineM1,lineM2,lineM3);
        // bring the circles to the front of the line
        dCircle.toFront();
        greenCircle.toFront();
        blueCircle.toFront();
        redCircle.toFront();

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}