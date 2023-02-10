package 프로그래머스;

class num_12912 {  // 두 정수 사이의 합
        public long num_12912(int a, int b) {
            long answer = 0;

            if (a > b) {
                for (int i = b; i <= a; i++) {
                    answer += i;
                }
            } else if (a == b) {
                answer = a;
            } else if (a < b) {
                for (int i = a; i <= b; i++) {
                    answer += i;
                }
            }

            return answer;
        }
}
