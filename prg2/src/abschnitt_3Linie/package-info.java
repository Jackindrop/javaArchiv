package abschnitt_3Linie;

/**
 * U08 Klasse Line
 * Vorführung bis 22.4.
 *
 * Teilaufgabe a.
 * basiert auf Vorlesung bis einschl. Abschnitt 2.i
 * Schreiben Sie eine Klasse Line mit zwei Endpunkten unter
 * Benutzung der Klasse Loc, die Sie in einem Archiv libloc.jar
 * als Anlage dieser Aufgabe finden. Eine Dokumentation dieser
 * Klasse finden Sie in liblocdocs.zip.
 *
 * Binden Sie bitte die Datei libloc.jar in Ihr eclipse-Projekt
 * ein. Wie das genau geht, erfahren Sie am Ende dieser Aufgabe.
 * Entpacken Sie die Datei liblocdocs.zip in einen beliebigen
 * Ordner und öffnen die Datei index.html in einem Internetbrowser.
 *
 * Um Ihr Programm zu testen, können Sie das aus der Vorlesung und
 * aus den Leseaufgaben bekannte DrawingPanel benutzen. Dazu
 * binden Sie bitte die als Anlage zu dieser Aufgabe verfügbare
 * Datei DrawingPanel.jar in Ihr eclipse-Projekt ein.
 *
 * Ihre Klasse Line soll die folgenden Verantwortlichkeiten
 * besitzen und dabei mit Loc zusammen arbeiten:
 *
 * Speicherung zweier Endpunkte
 * Berechnung einer String-Repräsentation
 * Berechnung der Länge
 * Zeichnen der Linie
 * Implementieren Sie dazu folgende Methoden in der Klasse Line
 * und achten dabei darauf, bereits vorhandene Funktionen der Klasse Loc nicht erneut zu implementieren.
 *
 * Konstruktor mit vier ganzzahligen Parametern in der
 * Reihenfolge p1.x, p1.y, p2.x, p2.y.
 * Zwei Abfragemethoden getP1 und getP2
 * Eine Methode toString, die einen String der folgenden Form
 * zurück liefert: [(22, 3), (4, 7)]. Nutzen Sie hierbei die
 * Methode toString der Klasse Loc.
 * Eine Methode getLength, die die Länge als double-Wert
 * zurück liefert. Nutzen Sie hierbei eine geeignete
 * Methode der Klasse Loc.
 * Eine Methode void draw(Graphics g), die die Linie zeichnet
 * (nur die Linie selbst, keine Endpunkte). Zum Zeichnen der
 * Linie benötigen Sie die Klasse DrawingPanel.
 * Teilaufgabe b.
 * basiert auf Vorlesung bis einschl. Abschnitt 2.j
 * Überladen Sie den Konstruktor Ihrer Klasse Line mit einem
 * weiteren Konstruktor, der zwei Parameter vom Typ Loc entgegen
 * nimmt. Setzen Sie die in der Vorlesung eingeführte "Verkettung
 * von Konstruktoren" ein, indem der neue Konstruktor den
 * alten aufruft.
 *
 * Teilaufgabe c.
 * basiert auf Vorlesung bis einschl. Abschnitt 2.o
 * Überladen Sie den Konstruktor Ihrer Klasse Line mit einem Copy-
 * Konstruktor. Anders als üblich soll dieser Konstruktor neben
 * dem zu kopierenden Original-Objekt einen zweiten boolean-
 * Parameter namens deepCopy erhalten, mit dem der Aufrufer
 * auswählen kann, ob eine tiefe oder eine flache
 * Kopie angelegt wird.
 *
 * Line line2= new Line(line1, true); // liefert eine tiefe Kopie von line1
 * Line line3= new Line(line1, false); // liefert eine flache Kopie von line1
 * Wie binden Sie die Datei libloc.jar in ein eclipse-Projekt ein?
 * Wählen Sie das Kontextmenü des Projekts > "Properties"
 *          > "Java Build Path" und hier den Reiter "Libraries".
 * Wählen Sie "Add External Jars" und navigieren Sie zur Datei
 * libloc.jar. Bestätigen Sie mit "Öffnen". Bestätigen Sie den
 * Properties Dialog mit "OK".
 * Sie können nun die Klasse de.hsh.prog.klasseline.Loc in Ihrem
 * Projekt einsetzen. Den Inhalt des soeben eingebundenen
 * Archivs sowie die verfügbaren Klassen und Methoden können Sie
 * einsehen, wenn Sie im Package Explorer unter Referenced
 * Libraries nach unten navigieren und die in Frage kommenden
 * Elemente Schritt für Schritt aufklappen.
 */