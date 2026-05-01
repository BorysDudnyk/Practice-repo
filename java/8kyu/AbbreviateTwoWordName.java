// Kyu: 8
// Problem: Convert two-word name into initials

public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    String[] splitName = name.split(" ");
    
    String first = splitName[0];
    String second = splitName[1];
    
    return ("" + first.charAt(0) + "." + second.charAt(0)).toUpperCase();
  }
}
