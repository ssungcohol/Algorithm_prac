package 프로그래머스;
import java.util.Arrays;

class num_12935 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        int[] answer = new int[arr.length - 1];

        int min = arr[0]; // arr 배열의 0번쨰 원소로 min 값 초기화

        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i] <= min) {
                answer[i] = arr[i];
            }
        }
        System.out.print(Arrays.toString(answer));
//        return answer;
    }
}
