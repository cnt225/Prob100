package Prob007;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num==1) {
            System.out.println("1은 소수가 아닙니다.");
        }
        else {
            boolean flag = true;
            int root = (int)Math.sqrt(num);
            for (int i=2; i<=root; i++) {
                if(num%root==0) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.printf("%d는 소수입니다.", num);
            }
            else {
                System.out.printf("%d는 소수가 아닙니다.", num);
            }
        }
    }
}
