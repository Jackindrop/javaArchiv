package abschnitt_8GUI;

import javafx.beans.value.ChangeListener;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.StrokeType;

import java.util.Locale;

import static abschnitt_8GUI.cicleLineDraggerPLUS.text;

class DraggableCirclePLUS extends Circle {
    double orgSceneX, orgSceneY;
    ChangeListener cL;
    private void updateText(Circle c) {
        text.setText(String.format(Locale.US, "(%.1f, %.1f)",
                c.getCenterX(), c.getCenterY()));
    }
    DraggableCirclePLUS(double x, double y) {
        super(x, y, 150);
        orgSceneX= x;
        orgSceneY= y;
        setFill(Color.YELLOW);
        setStroke(Color.GOLD);
        setStrokeWidth(2);
        setStrokeType(StrokeType.OUTSIDE);

        this.setOnMousePressed((MouseEvent t) -> {
            orgSceneX = t.getSceneX();
            orgSceneY = t.getSceneY();
            updateText(this);
            Circle c = (Circle) (t.getSource());

        });
        this.setOnMouseDragged((t) -> {
            double offsetX = t.getSceneX() - orgSceneX;
            double offsetY = t.getSceneY() - orgSceneY;
            updateText(this);
            Circle c = (Circle) (t.getSource());

            c.setCenterX(c.getCenterX() + offsetX);
            c.setCenterY(c.getCenterY() + offsetY);

            orgSceneX = t.getSceneX();
            orgSceneY = t.getSceneY();
        });

    }

}
