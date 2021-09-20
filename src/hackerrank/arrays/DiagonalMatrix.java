package hackerrank.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a square matrix, calculate the absolute difference between the sums of its diagonals.
 *
 * <p>For example, the square matrix is shown below:
 *
 * <p>
 *     1 2 3
 *     4 5 6
 *     9 8 9
 *
 * <p>The left-to-right diagonal = . The right to left diagonal = . Their absolute difference is .
 * |15-17| = 2
 */
public class DiagonalMatrix {

  public static void main(String[] args) {
    List<List<Integer>> matrix = new ArrayList<>();
    matrix.add(Arrays.asList(1, 2, 3));
    matrix.add(Arrays.asList(4, 5, 6));
    matrix.add(Arrays.asList(9, 8, 9));
    System.out.println(diagonalDifference(matrix));
  }

  public static int diagonalDifference(List<List<Integer>> arr) {
    int diag1Sum = 0, diag2Sum = 0;

    int j  = 0;

    for(int i = 0; i < arr.size(); i++){
        diag1Sum += arr.get(i).get(j);
        diag2Sum += arr.get(i).get(arr.size()-(i + 1));
        j++;
    }

    return Math.abs(diag1Sum - diag2Sum);
  }
}
