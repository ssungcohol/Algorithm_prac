package 프로그래머스;


class num_82612{
    public long solution(int price, int money, int count){
        int answer = 0;
        int num = 0;
        for (int i = 1; i <= count; i++) {
            num = price * i;
            num += num;
        }
        return num - money;
    }

//    public static void main(String[] args) {
//        num_82612 = new num_82612();
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        System.out.println(T.solution(a,b));
    }