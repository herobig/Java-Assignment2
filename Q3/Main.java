package Q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer");
        int n = sc.nextInt();
        System.out.println("Enter a character");
        char c = sc.next().charAt(0);
        ChangeSequence changeSequence = new ChangeSequence();
        changeSequence.form(n,c);
        changeSequence.form(c,n);

    }
}
