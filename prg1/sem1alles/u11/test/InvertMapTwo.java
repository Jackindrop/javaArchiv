import java.util.*;
public class InvertMapTwo {
public static void main(String[] args) {
    HashMap<String, String> byLand = 
    new HashMap<String, String>();
    byLand.put("Deutschland", "007");
    byLand.put("Ukraine", "No. 5");
    byLand.put("Belgien", "112");
    byLand.put("Polen", "911");
    System.out.println(byLand);
    //{James Bond=007, Chanel=No. 5, Porsche=911, Notruf=112}
    HashMap<String, String> byEinwohner = 
    new HashMap<String, String>();
    for (String key : byLand.keySet()) {
        byEinwohner.put(byLand.get(key), key);
    }
    System.out.println(byEinwohner);
    //{112=Notruf, 007=James Bond, 911=Porsche, No. 5=Chanel}
    }
}