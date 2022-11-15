import java.util.*;
public class ScriptAcht {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Programmieren"); // <> diamond opperator
        list.add("finde");
        list.add("ich");
        list.add("gut");
        System.out.println(list);
        list.add(3, "echt");
        list.add(4, "total");
        System.out.println(list);
        String temp = list.get(1);
        String Upper = temp.toUpperCase();
        list.set(1, Upper);
        System.out.println(list);
    }
}
    