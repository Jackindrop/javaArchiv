package u24;
/**
 * Teilaufgabe a.
 * basiert auf Vorlesung bis einschl. Abschnitt 6.g
 * Vorführung bis 3.6.
 *
 * In einer vernetzten Welt gibt es viele Objekte (Beobachter), deren Verhalten von der Änderung bestimmter Merkmale anderer beobachteter Objekte abhängt. Wir wollen die Abhängigkeit von beobachteten Objekten und Beobachtern in Code ausdrücken.
 *
 * Beobachter lauschen auf Wertänderungen und werden deshalb auch Listener genannt. Beobachter implementieren das Interface ChangeListener:
 *
 * public interface ChangeListener {
 *     void changed(ObservableProperty observable);
 * }
 * Die changed-Methode kann aufgerufen werden, um den ChangeListener darüber zu informieren, dass sich der Wert eines Merkmals (engl: property) eines beobachtbaren Objekts (observable) geändert hat.
 * Das beobachtete Merkmal besitzt einen aktuellen Wert. Wir drücken dies durch eine abstrakte Methode getValue in einer abstrakten Klasse ObservableProperty aus. Subklassen sind verpflichtet, diese Methode geeignet zu implementieren.
 *
 * public abstract class ObservableProperty {
 *     private ChangeListener listener;
 *     public void setListener(ChangeListener listener) {
 *         this.listener= listener;
 *     }
 *     protected void fireValueChangedEvent() {
 *         if (listener != null) {
 *             listener.changed(this);
 *         }
 *     }
 *     public abstract String getValue();
 * }
 * Damit ein ObservableProperty einen ChangeListener über seine Zustandsänderung informieren kann, besitzt die ObservableProperty ein Attribut vom Typ ChangeListener. Die Methode fireValueChangedEvent informiert den ChangeListener durch Aufruf der changed-Methode.
 *
 * Wir denken uns ein Beispiel aus. Ein Klingelknopf (bell button) ist ein beobachtetes Objekt mit dem Merkmal, das dieser "gedrückt" und "losgelassen" werden kann. Eine Türglocke (door bell) beobachtet die Zustandsänderung und reagiert durch Klingeln bzw. durch Stille:
 *
 * public class BellButton extends ObservableProperty {
 *     private boolean isPressed= false;
 *     public void press() {
 *         isPressed= true;
 *         fireValueChangedEvent();
 *     }
 *     public void release() {
 *         isPressed= false;
 *         fireValueChangedEvent();
 *     }
 *     @Override public String getValue() {
 *         if (isPressed) {
 *             return "pressed";
 *         } else {
 *             return "released";
 *         }
 *     }
 * }
 * Das folgende Hauptprogramm instanziiert einen Klingelknopf und betätigt diesen zwei Mal.
 *
 * public class BellMain {
 *     public static void main(String[] args) {
 *         BellButton btn= new BellButton();
 *         ...
 *         btn.press();
 *         btn.release();
 *         btn.press();
 *         btn.release();
 *     }
 * }
 * An der Stelle der drei Punkte ... fehlt Ihr Code. Schreiben Sie in einem ersten Schritt eine das Interface
 * ChangeListener implementierende, lokale Klasse namens DoorBell und melden ein DoorBell-Objekt als ChangeListener
 * beim btn an: btn.setListener(myDoorBellObject);.
 * Die gewünschte Ausgabe des Hauptprogramms ist:
 *
 * ring
 * silence
 * ring
 * silence
 * Wichtig: Die Klasse DoorBell soll eine lokale Klasse in der main-Methode sein!
 *
 * Teilaufgabe b.
 * basiert auf Vorlesung bis einschl. Abschnitt 6.g
 * Kopieren Sie den Code aus der vorstehenden Aufgabe. Ersetzen Sie im Code des Hauptprogramms die lokale Klasse
 * durch eine anonyme Klasse. Details hierzu finden Sie in den Vorlesungsfolien.
 *
 * Teilaufgabe c.
 * basiert auf Vorlesung bis einschl. Abschnitt 6.h
 * Kopieren Sie den Code aus der vorstehenden Aufgabe. Ersetzen Sie im Code des Hauptprogramms die lokale bzw.
 * anonyme Klasse durch einen Lambda-Ausdruck. Details hierzu finden Sie in den Vorlesungsfolien.
 *
 * Hintergrund
 * Übrigens: die Klassen ChangeListener und ObservableProperty repräsentieren eine einfache Variante des in der
 * objektorientierten Programmierung weit verbreiteten "Beobachter-Entwurfsmusters" (observer pattern).
 * Ausführliche Informationen zu diesem Muster finden Sie z. B. hier:
 * http://de.wikipedia.org/w/index.php?title=Beobachter_%28Entwurfsmuster%29&oldid=127979847.
 * Die Subklassen von ChangeListener und ObservableProperty werden in der Realität
 * (also in einem echten Programm und nicht in einer Übungsaufgabe wie dieser hier)
 * zwar häufig aber nicht notwendigerweise als lokale oder anonyme Klasse realisiert.
 * Sie können auch als ganz normale, eigenständige Subklassen geschrieben werden.
 * Ausblick
 * Im Kapitel über JavaFX werden Sie beobachtbare Properties als Standardelement der ereignisgesteuerten
 * Programmierung für grafische Benutzeroberflächen kennen lernen. Tatsächlich sind die hier implementieren Klassen
 * und Interfaces ChangeListener und ObservablePropertystark vereinfachte Versionen entsprechender Klassen und
 * Interfaces in der JavaFX-Standardbibliothek in den Packages javafx.beans.property bzw. javafx.beans.value.
 */