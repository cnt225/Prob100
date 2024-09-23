package Prob002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] fibo = new int[n];

        if(n>=2) {
            fibo[0] = 1;
            fibo[1] = 1;
            for(int i=2; i<n; i++) {
                fibo[i] = fibo[i-1] + fibo[i-2];
            }
        }
        for(int i=0; i<n; i++) {
            System.out.printf("%d ", fibo[i]);
        }

    }
}