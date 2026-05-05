// Kyu: 7
// Problem: Merge two strings, keep unique characters, return sorted result
// Approach: use TreeSet for uniqueness + sorting

import java.util.TreeSet;

public class TwoToOne {
    
    public static String longest (String s1, String s2) {
        TreeSet<Character> set = new TreeSet<>();
        
        for (char c : (s1 + s2).toCharArray()) {
            set.add(c);
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (char c : set) {
            sb.append(c);
        }
        
        return sb.toString();
    }
}
