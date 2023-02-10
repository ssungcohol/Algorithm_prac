package 백준;

public class num_5585 {
    public static void main(String[] args) {
        int money = 1000;
        int pay = 380; // Scanner
        int etc = 0;

        etc = ((money-pay) / 500) + ((money-pay) % 500) / 100 + (((money-pay) % 500) % 100) / 50 + ((((money-pay) % 500) % 100) % 50) / 10 + (((((money-pay) % 500) % 100) % 50) % 10) / 5 + ((((((money-pay) % 500) % 100) % 50) % 10) % 5) / 1;

        System.out.println(etc);
//        ==================================================================
//        for 문 사용 방법
//        Scanner scanner = new Scanner(System.in);
//
//        int pay = scanner.nextInt();
//        int money = 1000;
//        int change = money - pay;
//        int allCoin = 0;
//        int[] coin = new int[] {500, 100, 50, 10, 5, 1};
//
//        for (int i = 0; i < coin.length; i++) {
//            if (change >= coin[i]) {
//                allCoin += change / coin[i];
//                change = change % coin[i];
//            }
//        }
//
//        System.out.println(allCoin);
    }
}

//반복문으로 만들어보기!!


//=====================
//Scanner sc = new Scanner(System.in);
//int paid = sc.nextInt();
//int change = 1000 - paid;