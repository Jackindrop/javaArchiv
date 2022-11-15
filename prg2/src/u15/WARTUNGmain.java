package u15;

import java.util.ArrayList;
import java.util.Arrays;

public class WARTUNGmain {
    public static void main(String[] args) {
        ArrayList<Fußballspieler> team = new ArrayList<>();
        char n= 'a';
        for (int i= 0; i< 11; i++) {
            team.add(new Fußballspieler(Character.toString(n)));
            n+= 1;
        }
        printTeam(team);
        team.add(new Fußballspieler("derGefickte"));
        printTeam(team);
        System.out.println(team);

    }
    public static void printTeam(ArrayList<Fußballspieler> t) {
        System.out.println(t);
    }
}
