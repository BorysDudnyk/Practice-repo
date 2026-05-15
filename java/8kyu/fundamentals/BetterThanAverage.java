// Kyu: 8
// Problem: Compare your score with class average

public class Kata {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    int sum = 0;
    int count = 0;
    
    for(int i = 0; i < classPoints.length; i++){
      sum += classPoints[i];
      count++;
    }
    
    double average = (double) sum / count;
    
    return yourPoints > average;
  }
}
