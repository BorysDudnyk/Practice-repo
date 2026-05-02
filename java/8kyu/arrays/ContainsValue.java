// Kyu: 8
// Problem: Check if array contains value
// Note: handles null safely

public class Solution {

    public static boolean check(Object[] a, Object x) {
        
      for (Object e : a) {
        if (x == null) {
            if (e == null) return true;
        } else {
            if (x.equals(e)) return true;
        }
    }
      
    return false;
    }
}
