package 프로그래머스;

class num_12903 {  // 가운데 글자 가져오기
    public static void main(String[] args) {
        String str = new String();
        str = "abcde";
        String center = "";

        if (str.length() % 2 == 0) {
            center += str.charAt(str.length() / 2 -1);
            center += str.charAt(str.length() / 2);
        } else {
            center += str.charAt(str.length() / 2);
        }

        System.out.println(center);
    }
}
