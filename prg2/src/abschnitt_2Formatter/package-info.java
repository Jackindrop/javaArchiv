package abschnitt_2Formatter;
/*
U04 Datum-Klasse
basiert auf Vorlesung bis einschl. Abschnitt 2.e
Vorführung bis zum 25.3.
Schreiben Sie eine Klasse Datum, die ein Datum in den
ganzzahligen Attributen tag, monat und jahr speichert.
Beispielsweise repräsentiert das folgende Objekt den
17. Februar 1973: tag=17, monat=2, jahr=1973.

Realisieren Sie folgende Instanzmethoden:

Methode	Beschreibung

istSchaltjahr	Ohne Parameter. Liefert den Wahrheitswert, wenn
das Datum im gregorianischen Kalender ein Schaltjahr ist.

getDeutscheSchreibung	Ohne Parameter. Liefert den Text
TT.MM.JJJJ als String-Rückgabewert, wobei Tag, Monat und Jahr
jeweils auf die vorgegebene Stellenzahl mit führenden 0en
aufgefüllt werden. Tipp: verwenden Sie String.format (Details
in Kapitel 10 der Vorlesung PR1).

getAmerikanischeSchreibung	Ohne Parameter. Liefert den Text
MM/TT/JJJJ als String-Rückgabewert, wobei Tag, Monat und Jahr
jeweils auf die vorgegebene Stellenzahl mit führenden 0en
aufgefüllt werden.

setMorgen	Ohne Parameter. Verändert den Zustand des Objekts so,
dass es das Datum des folgenden Tages repräsentiert. setMorgen
soll ein korrektes Datum berechnen. Z. B. soll auf den 30.04.2014
der 01.05.2014 folgen. setMorgen darf davon ausgehen, dass in den
Attributen tag, monat und jahr im Aufrufzeitpunkt ein korrektes
Datum steht.



 */