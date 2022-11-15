package abschnitt_3Aktie;

/**
 *  Wir identifizieren hier zwei abstrakte Konzepte:
 * • Ein Aktie-Objekt akkumuliert alle Käufe einer einzelnen Aktie und berechnet den mit der
 * Aktie realisierten Gewinn
 * • AktieMain interagiert mit dem Benutzer und verwaltet die beiden beteiligten Aktie-
 * Objekte
 *
 * output:
 * ISIN der ersten Aktie: DE0008404005
 * Wie viele Käufe haben Sie getätigt? 2
 * 1: Wieviele Aktien zu welchem Kaufkurs? 50 35,06
 * 2: Wieviele Aktien zu welchem Kaufkurs? 25 38,52
 * Zu welchem Kurs notiert die Aktie heute? 37,29
 * Nettogewinn/-verlust: 80.75
 * ISIN der zweiten Aktie: US0231351067
 * Wie viele Käufe haben Sie getätigt? 3
 * 1: Wieviele Aktien zu welchem Kaufkurs? 15 16,50
 * 2: Wieviele Aktien zu welchem Kaufkurs? 10 18,09
 * 3: Wieviele Aktien zu welchem Kaufkurs? 20 17,15
 * Zu welchem Kurs notiert die Aktie heute? 17,82
 * Nettogewinn/-verlust: 30.5
 * DE0008404005 war rentabler als US0231351067.
 *
 * Implementierung von Aktie
 * Wir beginnen mit der zweiten Verantwortlichkeit „Speicherung der Daten der Käufe (Anzahl
 * und Kaufkurs)“ und realisieren diese in der Methode kaufe:
 * • Als Parameter benötigt diese Methode die anzahl (int) gekaufter Aktien und den
 * kaufKurs (double).
 * • Als Rückgabe erwarten wir nichts (void).
 * • Die Methode soll die anzahl auf eine gesamtAnzahl (int) aufaddieren. Dies gibt
 * uns den Hinweis auf das erste zu implementierende Attribut.
 * • Ähnlich soll die Methode das Produkt anzahl*kaufKurs auf ein Attribut
 * gesamtKosten aufsummieren.
 *
 */