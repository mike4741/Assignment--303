Task 
In this challenge, you must read an integer, a double, and a String from stdin, then print the values according to the instructions in the Output Format section below. To make the problem a little easier, a portion of the code is provided for you in the editor.

Sample Input

42
3.1415
Welcome to HackerRank's Java tutorials!


SOLUTION  

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        // Write your code here.
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}


OUTPUT 
  
  String: Welcome to HackerRank's Java tutorials!
  Double: 3.1415
  Int: 42