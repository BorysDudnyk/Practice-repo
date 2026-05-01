// Kyu: 8
// Problem: Check if hero survives dragons attack
// Rule: each dragon takes 2 bullets

class Solution {
  public static boolean hero(int bullets, int dragons) {
    return bullets >= (long) dragons * 2;
  }
}
