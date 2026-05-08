// Kyu: 7
// Problem: Count remaining passengers on the bus
// Method: stream + mapToInt + sum

import java.util.ArrayList;

class Metro {

  public static int countPassengers(ArrayList<int[]> stops) {
    /*int passenger = 0;
    
    for (int[] stop : stops) {
      passenger = passenger + (stop[0] - stop[1]);
    }
    
    return passenger;*/
    
    return stops.stream()
      .mapToInt(s -> s[0] - s[1])
      .sum();
  }
}
