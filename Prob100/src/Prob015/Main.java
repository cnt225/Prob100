package Prob015;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=n; i<=m; i++){
            for(int j=1; j<10; j++) {
                System.out.println(i + "*" +j+"="+i*j);
            }
        }

    }
}
