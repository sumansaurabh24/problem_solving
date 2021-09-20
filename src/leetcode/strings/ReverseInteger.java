package leetcode.strings;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the
 * value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 *
 * <p>Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 * Input: x = 123 Output: 321
 *
 * <p>Input: x = -123 Output: -321
 *
 * <p>Input: x = 120 Output: 21
 */
public class ReverseInteger {

  public static void main(String[] args) {
    //
    int num1 = 123;
    System.out.println(reverse(num1));

    int num2 = -123;
    System.out.println(reverse(num2));

    int num3 = 120;
    System.out.println(reverse(num3));
  }

  public static int reverse(int x) {
      int reversed = 0;
      while(x != 0){
          int remainder = x % 10;
          if (reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE / 10 && remainder > 7)) return 0;
          if (reversed < Integer.MIN_VALUE/10 || (reversed == Integer.MIN_VALUE / 10 && remainder < -8)) return 0;
          reversed = reversed * 10 + remainder;
          x = x / 10;
      }

      return reversed;
  }
}
