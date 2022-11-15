/** 10. Vermischtes: a. Aufzählungstypen
                     b. Zeichenketten-Vertiefung
                        -StringBuilder
                        -Ausgabeformatierung
                        -Fallstudie Fondsdaten umwandeln
                        -Variable Parameterlisten                           */
/** 10a. enum. Beispiel:
    public enum Spielkarte {
    KARO,
    HERZ,
    PIK,
    KREUZ //kann optional mit einem ; enden
    }
    Die Bezeichner KARO, HERZ, PIK und KREUZ können nun wie Konstante
    verwendet werden (z. B. auch in switch-Statements):
    public static int wert(Spielkarte karte) {
    switch(karte) {
    case KARO:
    return 9;
    case HERZ:
    return 10;
    case PIK:
    return 11;
    default /+ KREUZ +/: return 12;
    }
} 
…
System.out.println("Herz zählt " + wert(Spielkarte.HERZ));      */
// enum - HILFSMETHODEN / ANWENDUNG / AUSGABE
/** Hilfsmethoden:
        Eigenschaften von enums
        – name(): liefert den deklarierten Attributnamen als String
        String name = Spielkarte.HERZ.name(); // "HERZ"
        – ordinal(): liefert die Position einer Enum innerhalb der Deklaration.
        int idx = Spielkarte.HERZ.ordinal(); // 1
        – valueOf(String): Liefert Enum-Objekt zum Attributnamen.
        Spielkarte k= Spielkarte.valueOf("HERZ"); // Spielkarte.HERZ
        – values(): Liefert ein Array aller Enum-Objekte.
        for (Spielkarte k : Spielkarte.values()) …
    • Anwendung:
        public static int wert(Spielkarte karte) {
        return karte.ordinal()+9;
        }
        …
        for (Spielkarte karte : Spielkarte.values()) {
        System.out.println(karte.name() + " zählt " + wert(karte));
        }
    • Ausgabe:
        KARO zählt 9
        HERZ zählt 10
        PIK zählt 11
        KREUZ zählt 12
                                                                            */
import java.util.*;
public class verMischtes10 {