// Kyu: 6
// Problem: Insert spaces before uppercase letters
// Method: regex positive lookahead

public class BreakCamelCase {

    public static String camelCase(String input) {
        return input.replaceAll("(?=[A-Z])", " ");
    }
}
