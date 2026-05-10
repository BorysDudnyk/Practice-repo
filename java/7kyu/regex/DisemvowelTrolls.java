// Kyu: 7
// Problem: Remove vowels from string
// Approach 1: manual loop

public class Troll {
    public static String disemvowel(String str) {
      String res = "";
      
      for(int i = 0; i < str.length(); i++){
        char c = str.charAt(i);
        
        if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' &&
          c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U'){
          res = res + c;
        }
      }
      
      return res;
    }
}


// Approach 2: regex (preferred)

public class Troll {
    public static String disemvowel(String str) {
      
      return str.replaceAll("(?i)[aeiou]","");
    }
}
