// Topic: Input Output
// Source: Striver DSA Sheet
// Language: Java

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = in.nextLine();

        System.out.print("Enter the number also: ");
        int n = in.nextInt();

        System.out.println("Hello " + name);
        System.out.println("This is the number you entered " + n);

        in.close();
    }
}
