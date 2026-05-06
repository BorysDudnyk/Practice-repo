// Kyu: 8
// Problem: Remove every second element from array
// Approach: iterate and keep elements with even index

import java.util.ArrayList;

public class Kata {
  
  public static Object[] removeEveryOther(Object[] arr) {
    ArrayList<Object> res = new ArrayList<>();
    
    for(int i = 0; i < arr.length; i++) {
      if(i % 2 ==0) {
        res.add(arr[i]);
      }
    }
    
    return res.toArray(new Object[0]);
  }
}
