// Kyu: 7
// Problem: Filter names with exactly 4 letters
// Method: Stream filter

import java.util.List;
class Kata {
   public static List<String> friend(List<String> x){
     
     return x.stream()
       .filter(f -> f.length() == 4)
       .toList();
   }
}
