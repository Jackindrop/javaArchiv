import java.util.*;

public class KlausurA1 {
    public static void main(String[] args) {
        TreeMap<String, HashSet<String>> geSucht= new TreeMap<String, HashSet<String>>();
        TreeMap<String, HashSet<String>> geBoten= new TreeMap<String, HashSet<String>>();
        mapHans(geSucht, geBoten);
        mapUrsula(geSucht, geBoten);
        check("Hans", "Ursula", geSucht, geBoten);
    }
    
    public static HashSet<String> matches(HashSet<String> gesucht, HashSet<String> geboten) {
        HashSet<String> results= new HashSet<String>();
        results= gesucht;
        results.retainAll(geboten);
        return results;
    }
    public static void printer(String name1, String name2,HashSet<String> printOne, HashSet<String> printTwo) {
        System.out.println(name1+" findet an "+name2+": "+printOne);
        System.out.println(name2+" findet an "+name1+": "+printTwo);
    }
    
    public static void check(String name1, String name2, 
            TreeMap<String, HashSet<String>> geSucht, TreeMap<String, HashSet<String>> geBoten) {
        HashSet<String> result12= matches(geSucht.get(name1), geBoten.get(name2));
        HashSet<String> result21= matches(geSucht.get(name2), geBoten.get(name1));
        int points1= result12.size();
        int points2= result21.size();
        int matchPoints;
        if (points1>= points2) {
            matchPoints= points1;
        } else {
            matchPoints= points2;
        }
        if (matchPoints < 3) {
            System.out.println("Kein Match!");
        } else if (matchPoints >= 6) {
            System.out.println("Zweiseitiges Match!");
            printer(name1, name2, result12, result21);
        } else {
            System.out.println("Einseitiges March!");
            printer(name1, name2, result12, result21);
        }
    
    }
    public static void mapHans(TreeMap<String, HashSet<String>> geSucht, TreeMap<String, HashSet<String>> geBoten) {
        HashSet<String> geboten= new HashSet<String>();
        HashSet<String> gesucht= new HashSet<String>();
        Collections.addAll(geboten, "Treu", "Ehrlich", "Aufmerksam", "Groß", "Mann", "Bodenständig", "Fürsorglich", "Gesprächig");
        geBoten.put("Hans", geboten);
        Collections.addAll(gesucht, "Frau", "Ehrlich", "Sportlich", "Vermögend", "Geduldig", "Treu", "Gesprächig");
        geSucht.put("Hans", gesucht);
        
    }
    public static void mapUrsula(TreeMap<String, HashSet<String>> geSucht, TreeMap<String, HashSet<String>> geBoten) {
        HashSet<String> geboten= new HashSet<String>();
        HashSet<String> gesucht= new HashSet<String>();
        Collections.addAll(geboten, "Treu", "Ehrlich", "Geduldig", "Curvy", "Frau", "Tollpatsch", "Sportlich");
        geBoten.put("Ursula", geboten);
        Collections.addAll(gesucht, "Mann", "Ehrlich", "Aufmerksam", "Fürsorglich", "Geduldig", "Treu", "Gesprächig");
        geSucht.put("Ursula", gesucht);
    }   
}