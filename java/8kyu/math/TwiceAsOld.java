// Kyu: 8
// Problem: Find difference between father's age and twice son's age
// Method: absolute difference

public class TwiceAsOld {

    public static int twiceAsOld(int dadYears, int sonYears) {
        return Math.abs(dadYears - (2 * sonYears));
    }

}
