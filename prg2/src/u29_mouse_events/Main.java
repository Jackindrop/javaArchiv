package u29_mouse_events;
import java.util.Locale;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    private DraggableCircle dc;
    private Text text;
    double orgSceneX, orgSceneY;

    private void updateText() {
        text.setText(String.format(Locale.GERMAN, "(%.1f : %.1f)",
                dc.getCenterX(), dc.getCenterY()));
    }

    @Override
    public void start(final Stage stage) throws Exception {
        dc= new DraggableCircle(100d, 100d);
        text= new Text(10, 10, "");
        updateText(); // initialize once

        dc.setCursor(Cursor.CROSSHAIR);

        dc.setOnMousePressed((t) -> {
            orgSceneX = t.getSceneX();
            orgSceneY = t.getSceneY();
        });

        dc.setOnMouseDragged((t) -> {
            double offsetX = t.getSceneX() - orgSceneX;
            double offsetY = t.getSceneY() - orgSceneY;
            updateText();

            DraggableCircle c = (DraggableCircle) (t.getSource());
            c.setCenterX(c.getCenterX() + offsetX);
            c.setCenterY(c.getCenterY() + offsetY);
            orgSceneX = t.getSceneX();
            orgSceneY = t.getSceneY();
        });

        Group root = new Group(dc, text);
        stage.setScene(new Scene(root,
                400, 400, Color.ALICEBLUE));
        stage.setTitle("Drag Sample");
        stage.show();
    }
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}