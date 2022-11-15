package abschnitt_y;

import java.util.*;
public class Menge {
    public static void main(String[] args) {
        HashSet<Integer> A= new HashSet<Integer>();
        Collections.addAll(A, 1, 5, 6);
        HashSet<Integer> B= new HashSet<Integer>();
        Collections.addAll(B, 7, 5, 4, 8, 1);
        HashSet<Integer> C= new HashSet<Integer>();
        Collections.addAll(C, 6, 1, 9);
        System.out.println(A.toString());
        A.retainAll(B); //Schnittmenge
        A.addAll(C); //Vereinigungsmenge
        System.out.println(A.toString());
    }
}