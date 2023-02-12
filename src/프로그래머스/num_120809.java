package 프로그래머스;

public class num_120809 { // 배열 두배 만들기
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] answer = new int[numbers.length];

        int idx = 0;
        for(int i = 0; i < numbers.length; i++) {
            answer[idx] += numbers[i] * 2;
            idx++;
            }
        System.out.println(answer);
    }
}



//numbers	                    result
//[1, 2, 3, 4, 5]	            [2, 4, 6, 8, 10]
//[1, 2, 100, -99, 1, 2, 3]	    [2, 4, 200, -198, 2, 4, 6]