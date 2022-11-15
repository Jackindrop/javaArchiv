package abschnitt_1;
import com.bjp.DrawingPanel;
import java.awt.*;

public class WithPanel {
    public static void main(String[] args) {
        DrawingPanel panel= new DrawingPanel(200, 100);
        Graphics g;
        g = panel.getGraphics();
        //--------------------------------draw BLACK outlines
        g.setColor(Color.BLACK);
        g.drawRect(5, 5, 30, 90); 				   // figure 1
        g.drawPolygon(new int[] {60, 80, 60, 40},  // figure 2
                new int[] {20, 40, 60, 40}, 4);
        g.drawLine(60, 60, 60, 95);
        //--------------------------------draw Fills
        g.setColor(Color.RED);					   // figure 1
        g.fillOval(10, 10, 20, 20);
        g.setColor(Color.GREEN);
        g.fillOval(10, 70, 20, 20);
        g.setColor(Color.YELLOW);
        g.fillOval(10, 40, 20, 20);
        g.fillPolygon(new int[] {60, 70, 60, 50},  // figure 2
                new int[] {30, 40, 50, 40}, 4);
    }
}
