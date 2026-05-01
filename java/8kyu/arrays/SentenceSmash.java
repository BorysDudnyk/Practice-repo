// Kyu: 8
// Problem: Smash array of words into a sentence
// Key idea: string joining with spaces
// Method: String.join

public class SmashWords {

    public static String smash(String... words) {
        return String.join(" ", words);
    }
}
