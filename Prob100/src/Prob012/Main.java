package Prob012;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i=0; i<num; i++) {
            for(int j=0; j<num; j++) {
                System.out.printf("%4d", num*j+i+1);
            }
            System.out.println();
        }
    }
}

