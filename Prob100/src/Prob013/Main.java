package Prob013;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i=0; i<num; i++) {
            for(int j=0; j<num; j++) {
                System.out.printf("%4d", (i+1)*(j+1));
            }
            System.out.println();
        }
    }
}