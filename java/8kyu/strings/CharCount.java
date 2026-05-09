// Kyu: 8
// Problem: Count occurrences of character in string
// Approach: loop through char array

public class CodeWars {
  public static int strCount(String str, char letter) {
    int count = 0;

    for(char c : str.toCharArray()){
      if(c == letter){
        count++;
      }
    }
    
    return count;
  }
}
