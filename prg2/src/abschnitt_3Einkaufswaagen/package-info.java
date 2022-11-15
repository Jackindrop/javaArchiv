package abschnitt_3Einkaufswaagen;

/**
 * Schreiben Sie eine Klasse ShoppingCart, die eine Menge von
 * einzukaufenden Artikeln enthält, und eine Klasse CartItem im
 * selben Package, die einen einzukaufenden Artikel zusammen mit
 * der gewünschten Anzahl repräsentiert
 * (z. B. "vier Dosen Hundefutter").
 *
 * Die Klasse ShoppingCart soll intern eine ArrayList der
 * CartItems verwenden und folgende Methoden anbieten:
 *
 * Methode	Beschreibung
 * ShoppingCart()	initialisiert einen leeren Einkaufswagen
 * void addItem(CartItem item)	Fügt einen Artikel hinzu
 * double getTotalCost()	Liefert den Gesamtpreis aller
 * Artikel im Einkaufswagen.
 * Die Klasse CartItem soll intern die Anzahl der gekauften
 * Artikel und den Einzelpreis speichern.
 *
 * Gewünschte Methoden der Klasse CartItem sind:
 *
 * Methode	Beschreibung
 * CartItem(String name, int quantity, double pricePerUnit)
 * initialisiert einen einzukaufenden Artikel mit den
 * gegebenen Daten.
 * double getCost()	Liefert den Gesamtpreis des Artikels.
 * D. h. bei z. B. vier Dosen Hundefutterzu je 3,20 liefert
 * diese Methode 12,80.
 * void setQuantity(int quantity)	Setzt die Anzahl auf den
 * gegebenen Wert.
 *
 *
 * Teilaufgabe b.
 * Programmieren Sie die Invariante: "Die Anzahl (quantity) eines
 * Artikels ist stets ≥ 1". Vermeiden Sie Redundanz
 */