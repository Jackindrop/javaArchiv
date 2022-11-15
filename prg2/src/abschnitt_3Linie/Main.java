package abschnitt_3Linie;

import java.awt.Graphics;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.bjp.DrawingPanel;

/** Displays a set of cities and simulates a broadcast station. */
public class Main {
    public static Station erzeugeStation() {
     //   Scanner console = new Scanner(System.in);
     //   System.out.print("Sender x? ");
        int senderx = 25;
      //  System.out.print("Sender y? ");
        int sendery = 63;
    //    System.out.print("Radius? ");
        int radius = 50;
        return new Station(senderx, sendery, radius);
    }

    public static Graphics erzeugeZeichenbereich() {
        DrawingPanel panel = new DrawingPanel(200, 200);
        return panel.getGraphics();
    }

    public static void staedteLesenUndZeichnen(Station station,
                                               Graphics g) throws FileNotFoundException {
        Scanner input = new Scanner(new File("cities.txt"));
        int numCities = input.nextInt();
        // first line = # of cities
        for (int i = 0; i < numCities; i++) {
            Loc city = new Loc(input.nextInt(), input.nextInt());
            station.drawReceiver(g, city);
        }
        input.close();
    }

    public static void main(String[] args)
            throws FileNotFoundException {
        Station station = erzeugeStation();
        Graphics g = erzeugeZeichenbereich();
        station.draw(g);
        staedteLesenUndZeichnen(station, g);

        Linie line1= new Linie(50, 20, 150, 91);
        line1.draw(g);
        // Tief-kopiert
        Linie line2= new Linie(line1, true);
        // Flach kopiert
        Linie line3= new Linie(line1, false);
        System.out.println(line3.getLength());
    }
}