package 백준;

public class num_8958 {
    public static void main(String[] args) {
        String str1 = "OOXXOXXOOO"; // 10
        String str2 = "OOXXOOXXOO"; // 9
        String str3 = "OXOXOXOXOXOXOX";  // 7
        String str4 = "OOOOOOOOOO";  // 55
        String str5 = "OOOOXOOOOXOOOOX";  // 30

        // for 문 사용, 누적 점수 저장 변수, 조건문 사용
        // O를 만나면 점수 누적, X면 점수가 초기화 되고 다시 , 누적

//        int totalsum = 0;
//        int cnt = 0;
//
//
//        for (int i = 0; i < str1.length(); i++) {
//            if (str1.charAt(i) == 'O') {
//                cnt++;
//                totalsum += cnt;
//            } else /*if (str1.charAt(i) == 'X')*/ {
//                cnt = 0;
//            }
//        }
//        System.out.println(totalsum);

        for (int i = 0; i < str1.length(); i++) {
            int count = 0; // 연속횟수
            int sum = 0; // 누적 합

            for (int j = 0; j < str1.length(); j++) {
                if (str1.charAt(j) == 'O') {
                    count++;
                } else {
                    count = 0;
                }
                sum += count;
            }
            System.out.println(sum);

        }
}

//        int caseNum = sc.nextInt();
//        for (int i=0; i<caseNum; i++){
//            int bonus = 1, answer = 0;
//            String s = sc.next();
//            for (int j=0; j<s.length(); j++){
//                if (s.charAt(j)=='O'){
//                    answer += bonus;
//                    bonus++;
//                }
//                else bonus = 1;
//            }
//            System.out.println(answer);
