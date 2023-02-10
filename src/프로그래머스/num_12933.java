package 프로그래머스;

class num_12933 {
        public long solution(long n) { // 내림차순으로 배치하기
            String answer = "";

            String str = Long.toString(n); // 정수 n을 문자열 str로 변환
            int[] num = new int [str.length()]; // str 문자열 길이만큼의 int 형 배열 num을 생성

            for (int i = 0; i < str.length(); i++){ //
                String s = str.substring(i, i+1); // substring 문자열을 잘라서 리턴
                num[i] = Integer.parseInt(s);  // 자른 문자열을 정수로 변환해서 num의 i번째에 리턴
            }
            // 배열 내림차순 정렬
            for (int i = 0; i < num.length; i++) { //배열num을 num 만큼 반복
                for (int j = 0; j < num.length - 1 - i; j++) { // 가장 작은 수를 맨 뒤로 밀면서 반복문 수행
                    if(num[j] < num[j+1]) { //앞 수와 뒷 수를 비교
                        int tmp = num[j]; // 낮은 수를 tmp에 넣고
                        num[j] = num[j+1]; // 큰 수를 앞으로 교체
                        num[j+1] = tmp; // 뒤에는 다시 작은 수로 교체하여 반복문 수행할 때마다 낮은 수는 뒤로 밀림
                    }
                }
            }
            // 내림차순으로 정렬된 배열을 answer에 하나씩 넣어준다.
            for (int i = 0; i < num.length; i++){
                answer += num[i];
            }

            return Long.parseLong(answer);

//         String[] list = String.valueOf(n).split("");
//         Arrays.sort(list);

//         StringBuilder sb = new StringBuilder();
//         for (String aList : list) sb.append(aList);

//         return Long.parseLong(sb.reverse().toString());