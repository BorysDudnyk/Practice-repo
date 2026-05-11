// Kyu: 7
// Problem: Sum first n terms of series
// Series: 1 + 1/4 + 1/7 + ...

public class NthSeries {
	public static String seriesSum(int n) {
    double sum = 0.0;
    for(int i = 0; i < n; i++){
      sum += 1.0 / (1 + i * 3);
    }
    
    return String.format("%.2f", sum);
	}
}
