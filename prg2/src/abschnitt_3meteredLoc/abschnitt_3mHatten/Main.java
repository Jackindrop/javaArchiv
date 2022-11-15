package abschnitt_3meteredLoc.abschnitt_3mHatten;

import com.bjp.DrawingPanel;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Displays a set of cities and simulates a broadcast station. */
public class Main {


    public static Station erzeugeStation() {
        Scanner console = new Scanner(System.in);
        System.out.print("Sender x? ");
        int senderx = console.nextInt();
        System.out.print("Sender y? ");
        int sendery = console.nextInt();
        System.out.print("Radius? ");
        int radius = console.nextInt();

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
        System.out.print("ManhattenDistanz zwischen P1(0, 0) & P2(6, 6): ");
        MeteredLoc  mHattenDummy= new MeteredLoc(0, 0);
        System.out.println(mHattenDummy.mHatten(new Loc(6, 6)));
        mHattenDummy.setLocation(1, 0);
        mHattenDummy.setLocation(0, 20);
        System.out.println("totalDistance= "+ mHattenDummy.getTotalDistance());
        //TODO stoße berechnung zur ausgabe der manhattenDistanz an

        Station station = erzeugeStation();
        Graphics g = erzeugeZeichenbereich();
        station.draw(g);
        staedteLesenUndZeichnen(station, g);
    }
}