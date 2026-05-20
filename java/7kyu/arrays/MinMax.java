// Kyu: 7
// Problem: Find minimum and maximum values in array

import java.util.Arrays;

class MinMax {
    public static int[] minMax(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        return new int[]{min, max};
    }
}
