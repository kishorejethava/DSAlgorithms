package util;

import java.util.Arrays;
import java.util.Scanner;

public class Utility {
    public static int[] readIntArr() {
        Scanner in = new Scanner(System.in);
        String[] arr = in.nextLine().split(" ");
        in.close();
        return Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
    }
}
