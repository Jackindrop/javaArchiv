package probeKlausur.ACHT;

import java.io.Serializable;

public class Person implements Serializable {
    public String name;
    public Person a;
    public Person b;
    public Person(String name) {
        this.name= name;
    }
}