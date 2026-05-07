// Kyu: 8
// Problem: Replace digits below 5 with 0, otherwise 1
// Method: regex replaceAll()

public class FakeBinary {
    public static String fakeBin(String numberString) {
        return numberString
          .replaceAll("[0-4]", "0")
          .replaceAll("[5-9]", "1");
    }
}
