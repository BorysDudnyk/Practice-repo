// Kyu: 8
// Problem: Remove first and last character of a string
// Method: String.substring

public class RemoveChars {
    public static String remove(String str) {

      return str.substring(1, str.length() - 1);
    }
}
