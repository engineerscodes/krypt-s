package Traditional_Ciphers;
import java.io.*;
import java.util.*;

public class Fiestel_Cipher {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        int KEY = (int)(Math.random() * ((Integer.MAX_VALUE)));

        String str = in.nextLine();

        if (str.length() % 2 != 0)
            str += " ";

        System.out.println("Entered Text: "+ str);

        int mid = str.length() / 2;
        for (int i = 0; i < mid; i++)
            left.add((int) str.charAt(i));

        for (int i = mid; i < str.length(); i++)
            right.add((int) str.charAt(i));

        for (int j = 1; j <= 3; j++) 
        {
            for (int i = 0; i < right.size(); i++) 
            {
                left.set(i, left.get(i) ^ (function(right.get(i), KEY, j)));
            }
            System.out.println("ENC" + j + " " + left + " " + right);
            temp = left;
            left = right;
            right = temp;
        }
        for (int j = 3; j >= 1; j--) 
        {
            temp = left;
            left = right;
            right = temp;
            for (int i = 0; i < right.size(); i++)
            {
                left.set(i, left.get(i) ^ (function(right.get(i), KEY, j)));
            }
            System.out.println("DEC" + j + " " + left + " " + right);
        }

        System.out.print("Output: " );

        for (int i : left) 
            System.out.print((char) i);

        for (int i : right) 
            System.out.print((char) i);

    }

    private static int function(int cur, int key, int roundNumber) {
        return (int) Math.pow(2 * key, cur) % 15;
    }
}
