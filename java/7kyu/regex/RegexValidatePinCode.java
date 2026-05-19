// Kyu: 7
// Problem: Validate ATM PIN code
// Rule: exactly 4 or 6 digits

public class Solution {

  public static boolean validatePin(String pin) {
    return pin.matches("\\d{4}|\\d{6}");
  }
}
