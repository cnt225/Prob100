package Prob014;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[10];
        while(num > 0) {
            arr[num%10]++;
            num/=10;
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(i + "가 나온 횟수 : " + arr[i]);
        }
    }
}