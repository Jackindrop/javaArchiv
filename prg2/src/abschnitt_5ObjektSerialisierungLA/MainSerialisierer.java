package abschnitt_5ObjektSerialisierungLA;

import java.io.*;
import java.util.ArrayList;


public class MainSerialisierer {

    public static void main(String[] args) throws IOException,
            ClassNotFoundException {

        ArrayList<Person> personen= new ArrayList<Person>();
        personen.add(new Person("Gerd", 23, 47000));
        personen.add(new Person("Maria", 65, 77000));
        speichern(personen, "personenlist.dat");
        ArrayList<Person> neu= (ArrayList<Person>)laden("personenlist.dat");
        for (Person p : neu) {
            System.out.println(p);
        }
    }

    public static void speichern(Object o, String filename) throws IOException {
        FileOutputStream file = new FileOutputStream(filename);
        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(o);
        out.close();
    }

    public static Object laden(String filename)
            throws IOException, ClassNotFoundException {
        FileInputStream f = new FileInputStream(filename);
        ObjectInputStream input = new ObjectInputStream(f);
        Object o= input.readObject();
        input.close();
        return o;
    }
}
