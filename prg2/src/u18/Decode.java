package u18;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;

public class Decode {

    public static void main(String[] args) {
        try {
            ArrayList<Person> reBuild=
                    (ArrayList<Person>)decode("friends.dat");
            for (Person p : reBuild) {
                System.out.println(p); // gehalt 0 wegen transient Schlüsselwort vor Attribut deklaration
            }
        } catch (IOException  | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Object decode(String filename)
            throws IOException, ClassNotFoundException {
    
        FileInputStream fis = new FileInputStream(filename);
        ObjectInputStream ois = new ObjectInputStream(fis);

        return ois.readObject(); // oder convertFromByteString(filename)
    }

    public static Object convertFromByteString(String byteString) throws IOException, ClassNotFoundException {
        final byte[] bytes = Base64.getDecoder().decode(byteString.getBytes(StandardCharsets.UTF_8));
        try (ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
             ObjectInput in = new ObjectInputStream(bis)) {
            return in.read();
        }
    }

    public static String convertToByteString(Object object) throws IOException {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream(); ObjectOutput out = new ObjectOutputStream(bos)) {
            out.writeObject(object);
            final byte[] byteArray = bos.toByteArray();
            return Base64.getEncoder().encodeToString(byteArray);
        }
    }

    public static void code(Object o, String filename) throws IOException {
        FileOutputStream file = new FileOutputStream(filename);
        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(o);
        out.close();
    }

    public static ArrayList<Person> getPersons() {
        ArrayList<Person> personen= new ArrayList<Person>();
        Person p1= new Person("Gerd");
        p1.setBestFriend(new Person("HurenSohn"));
        Person p2= new Person("Maria");
        p2.setBestFriend(new Person("Kevin"));
        personen.add(p1);
        personen.add(p2);
        return personen;
    }
}
