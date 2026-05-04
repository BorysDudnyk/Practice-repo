// Kyu: 7
// Problem: Convert string to Jaden Case (capitalize each word)
// Approach: split → modify → join

public class JadenCase {

	public String toJadenCase(String phrase) {
		
    if(phrase == null || phrase.isEmpty()) {
      return null;
    }
    
    String[] words = phrase.split(" ");
    
    String[] result = new String[words.length];
        
    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      result[i] = word.substring(0, 1).toUpperCase() + word.substring(1);
    }
    
    return String.join(" ", result);
	}

}
