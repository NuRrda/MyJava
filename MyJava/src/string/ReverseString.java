package string;

import java.util.Arrays;

/**
 * Created by mdev on 4/12/15.
 */
public class ReverseString {

    public static void main(String[] args) {
        char[] rev = reverser("Mangal");
        String input = "i like this program very much";
        char[] in = input.toCharArray();
        reverse(in,0,in.length - 1);
        System.out.println("in = " + in);

    }

    public static void reverse(char[] input,int first, int last){
        while(first < last){
            char temp = input[last];
            input[last] = input[first];
            input[first] = temp;
            first++;
            last--;
        }
    }
    public static char[] reverser(String input){
        char[] in = input.toCharArray();
        int len = input.length();
        for (int i = 0; i < len/2; i++) {
            char temp = in[i];
            in[i] = in[len - i -1];
            in[len - i - 1] = temp;
        }
        return in;
    }
}
