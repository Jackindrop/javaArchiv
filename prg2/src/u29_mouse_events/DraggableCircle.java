package u29_mouse_events;

import javafx.beans.value.ChangeListener;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.StrokeType;

class DraggableCircle extends Circle {
    ChangeListener cL;
    DraggableCircle(double x, double y) {
        super(x, y, 60);
        setFill(Color.YELLOW);
        setStroke(Color.GOLD);
        setStrokeWidth(2);
        setStrokeType(StrokeType.OUTSIDE);
    }

}
