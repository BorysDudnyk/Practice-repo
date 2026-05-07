// Kyu: 8
// Problem: Convert km/h to cm/s
// Method: unit conversion + floor cast

public class Cockroach {
  public int cockroachSpeed(double x) {
    return (int) (x * 100000.0 / 3600.0);
  }
}
