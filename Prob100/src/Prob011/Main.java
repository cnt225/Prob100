package Prob011;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                if(i%2==0){
                    System.out.printf("%4d", num*i + j +1);
                } else{
                    System.out.printf("%4d", num*i + num - j);
                }
            }
            System.out.println();
        }
    }
}