package u30_FX_SuchDialog;
/**
 * U30 Suchdialog mit JavaFX
 * basiert auf Vorlesung bis einschl. Abschnitt 8.d
 * Vorführung bis 17.6.
 *
 * In dieser Aufgabe sollen Sie eine kleine JavaFX-Anwendung entwickeln. Diese Anwendung soll die in der Vorlesung
 * präsentierten Konzepte aufgreifen und anwenden. Die Aufgabe dient also zunächst der einfachen Wiederholung.
 * Ihnen ist frei gestellt, die Anwendung als Ausgangspunkt für eine intensivere Auseinandersetzung mit JavaFX zu
 * nutzen. Für die volle Punktzahl ist dies jedoch nicht erforderlich.
 *
 * Schreiben Sie eine JavaFX-Anwendung, die im Grundgesetz alle Zeilen sucht, die ein gegebene Suchwort
 * enthalten. Die beiden folgenden Bildschirmfotos zeigen Schnappschüsse:
 *
 *
 *
 *
 * Die Anwendung startet mit einem leeren Eingabefeld und einem leeren Ausgabebereich und einer leeren
 * Statuszeile (unten). Der Benutzer gibt ein Wort ein und betätigt den Suchen-Button. Daraufhin öffnet
 * Ihre Anwendung im Hintergrund eine Datei "gg.txt" zum Lesen und sucht alle Zeilen in dieser Datei,
 * die das eingegebene Wort enthalten. Die gefundenen Zeilen werden mit führenden Zeilennummern im
 * Ausgabebereich ausgegeben. Zusätzlich wird eine etwas größere Ausgabezeile mit der Anzahl der Zeilen
 * ausgegeben, in denen das Suchwort vorkommt.
 * Falls Ihre Anwendung die Datei gg.txt nicht öffnen kann oder falls anderer Ein-/Ausgabefehler
 * auftreten, soll die entsprechende Fehlermeldung in der Statuszeile unten erscheinen. Denken Sie
 * daran, die Statuszeile im Erfolgsfall wieder zu löschen.
 *
 * Ein paar Tipps:
 *
 * Sehen Sie sich die Folien der Vorlesung 8 bis einschließlich 8.d an. Sie finden dort alles,
 * was Sie zur Entwicklung der Anwendung benötigen.
 * Als Layout bietet sich eine BorderPane an.
 * Das Zentrum der Borderpane besteht z. B. aus einer VBox mit Ausgabetitelzeile und Ausgabeinhaltsbereich.
 * Den Ausgabeinhaltsbereich betten Sie sinnvollerweise in ein ScrollPane ein.
 * Der Ausgabeinhaltsbereich ist ein Label.
 * Die Ausgabetitelzeile ist ein Label mit einer etwas größeren Schriftart (...setStyle("-fx-font-size:20pt");).
 * Als Anlage zur Aufgabe finden Sie eine Datei "gg.txt" mit dem Inhalt des Grundgesetzes.
 * Die Textcodierung dieser Dateoi ist ISO-8859-1. Verwenden Sie deshalb den Konstruktoraufruf
 * new Scanner(datei, "ISO-8859-1") zum Öffnen der Datei.
 */