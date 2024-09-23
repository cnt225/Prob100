package Prob001;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student stu1 = new Student("최정", "491");
        Student stu2 = new Student("추신수", "123");
        Student stu3 = new Student("박지환", "999");

        ArrayList<Student> list = new ArrayList<>();

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("검색을 계속하시려면 y, 종료하시려면 n을 입력해주세요");
            String input = scan.next();
            if(input.equals("y")) {
                System.out.println("검색을 시작합니다.");
                String name = scan.next();
                Boolean flag = false;
                for(Student iter : list) {
                    if(iter.getName().equals(name)) {
                        System.out.println("해당하는 학생의 학번: " + iter.getNo());
                        flag = true;
                    }
                }
                if(!flag) {
                    System.out.println("입력하신 이름에 해당하는 학생이 없습니다.");
                }
            } else{
                System.out.println("종료되었습니다.");
                break;
            }
        }
    }
}