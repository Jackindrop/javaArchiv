package abschnitt_2LocFinal;

import com.bjp.DrawingPanel;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Displays a set of cities and simulates a broadcast station. */
public class Sender {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("cities.txt"));
        Loc[] cities = readCities(input);
        input.close();

        DrawingPanel panel = new DrawingPanel(300, 300);
        Graphics g = panel.getGraphics();
        drawCities(cities, g);

        // put the station:
        Scanner console = new Scanner(System.in);
        Loc sender = new Loc();
        System.out.print("Sender x? ");
        sender.setX(console.nextInt());
        System.out.print("Sender y? ");
        sender.setY(console.nextInt());
        System.out.print("Radius? ");
        int radius = console.nextInt();
        send(sender, radius, cities, g);
    }

    /** Reads input file of cities and returns them as array of Locs. */
    public static Loc[] readCities(Scanner input) {
        int numCities = input.nextInt();   // first line = # of cities
        Loc[] cities = new Loc[numCities];
        for (int i = 0; i < cities.length; i++) {
            cities[i] = new Loc();
            cities[i].setX(input.nextInt());  // read city x/y from file
            cities[i].setY(input.nextInt());
        }
        return cities;
    }

    /** Draw cities */
    public static void drawCities(Loc[] cities, Graphics g) {
        for (int i = 0; i < cities.length; i++) {
            cities[i].draw(g);
        }
    }

    /** Simulates putting a broadcast station at the given location. */
    public static void send(Loc sender, int radius, Loc[] cities, Graphics g) {
        g.setColor(Color.RED);
        g.drawOval(sender.getX() - radius, sender.getY()
                - radius, 2 * radius, 2 * radius);
        for (int i = 0; i < cities.length; i++) {
            double distance= cities[i].distance(sender);
            if (distance <= radius) {
                cities[i].draw(g);
            }
        }
    }
}

