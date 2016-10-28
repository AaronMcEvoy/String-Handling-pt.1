import java.io.*;
import java.util.*;
import java.util.Scanner;
public class reverseString {
 public static void main(String[] args) {
    Scanner user_input = new Scanner(System.in);
    String input;
    System.out.println("Enter a string");
    input = user_input.next();
    char[] temparray= input.toCharArray();
    int left,right=0;
    right=temparray.length-1;
    for (left=0; left < right ; left++ ,right--)
    {
     // Swap values of left and right 
     char temp = temparray[left];
     temparray[left] = temparray[right];
     temparray[right]=temp;
    }
    for (char c : temparray)
     System.out.print(c);
    System.out.println();
   }
}
  