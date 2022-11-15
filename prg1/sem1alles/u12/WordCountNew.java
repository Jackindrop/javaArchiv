import java.io.*; // identifiziert & zählt wörter einer
import java.util.*; // Datei, gibt danach Anzahl der Worte
public class WordCountNew { // als Liste aus.
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String,Integer> words= new HashMap<String,Integer>();
        
        Scanner input= new Scanner(new File("text.txt"));
        while (input.hasNext()) {
            String word= input.next();
            if (words.containsKey(word)) {
                int count= words.get(word); // bekanntes Wort
                count++;
                words.put(word, count);
            } else {
                words.put(word, 1); // neues Wort
            }
           }
           input.close();
           // mithilfe von iterator Collection durchgehen
           Iterator<String> itr= words.keySet().iterator();
           while (itr.hasNext()) {
               String word= itr.next();
               int count= words.get(word);
               System.out.println(word+": " + count);
           }
           // TreeMap<Integer, TreeSet<String>>
           // Struktur , die jeder Häufigkeit einer 
           //Wortmenge zuordnet
           TreeMap<Integer, TreeSet<String>> sortedWords=
               new TreeMap<Integer, TreeSet<String>>();
           
           for (String word : words.keySet()) {
               int count= words.get(word);
               if (sortedWords.containsKey(count)) {
                   TreeSet<String> set= sortedWords.get(count);
                   set.add(word);
               // sortedWords.get(count).add(word);
               } else {
                   TreeSet<String> set= new TreeSet<String>(); // leere menge
                   sortedWords.put(count, set);
                   set.add(word);
               }
           } // wörter nach häufigkeit ausgeben
           for (int count : sortedWords.keySet()) {
               System.out.println("Häufigkeit: " + count);
               System.out.println(" " + sortedWords.get(count));
           }
    
    }                           
}
            
