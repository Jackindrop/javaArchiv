package probeKlausur.ACHT;

import java.io.*;
import java.util.ArrayList;

public class PersonMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person hans= new Person("Hans");
        Person ilka= new Person("Ilka");
        hans.a= ilka;
        hans.b= hans;
        ilka.a= hans;
        ilka.b= hans;
        ArrayList<Person> list1= new ArrayList<Person>();
        list1.add(hans);
        list1.add(ilka);

        ByteArrayOutputStream bos= new ByteArrayOutputStream();
        ObjectOutputStream os= new ObjectOutputStream(bos);
        os.writeObject(list1);
        os.close();
        ByteArrayInputStream bis= new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream is= new ObjectInputStream(bis);
        ArrayList<Person> list2= (ArrayList<Person>)is.readObject();
        is.close();
    }
}