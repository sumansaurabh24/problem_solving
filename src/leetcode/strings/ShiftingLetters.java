package leetcode.strings;

/** "qoqpvw" [95,7,67,21,33,23] */
public class ShiftingLetters {

  public static void main(String[] args) {
    String s = "bad";
    int[] shifts = {10,20,30};
    System.out.println(shiftingLetters(s, shifts));
  }

  public static String shiftingLetters(String s, int[] shifts) {

    for(int i = 0; i < shifts.length; i++){
        for(int j = 1; j < i; ){

        }
    }
    char[] strArr = s.toCharArray();

    for (int i = 0; i < shifts.length; i++) {

      for (int j = 0; j <= i; j++) {
        int shift = shifts[i];
        while (shift > 26) {
          shift -= 26;
        }

        int targetChar = strArr[j] + shift;
        if (targetChar > 'z') {
          targetChar = 'a' - 1 + (targetChar - 'z');
        }
        strArr[j] = (char) (targetChar);
      }
    }

    return new String(strArr);
  }
}
