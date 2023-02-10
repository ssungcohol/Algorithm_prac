package 프로그래머스;

import java.util.Scanner;

public class num_12937 {
    public String solution(int num){
        String answer = "";
        if (num % 2 == 0)
            answer = "Even";
        else
            answer = "Odd";
        return answer;
    }
    public static void main(String[] args) {
        num_12937 T = new num_12937();
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(T.solution(i));
    }
}