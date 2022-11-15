public class WordCount {
    public static void main(String[] args) {
        System.out.println(wordCount("The quick brown fox"));
    }
    public static int wordCount(String s) {
        return s.split(" ").length;
    }// zählt worte und gibt anzahl zurück
}