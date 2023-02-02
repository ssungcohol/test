public class Test_5 {
    public int solution(String s) {
        int answer = 0;

        int cnt = 0;  //  문자가 'O'를 카운트해줄 변수 cnt (누적)
        int sum = 0;  //  문자가 '0'일 때 점수를 더해줄 변수 sum

        for (int i = 0; i < s.length(); i++) {  // 문자열 s의 길이만큼 반복하는 반복문 작성
            if (s.charAt(i) == 'O') {  // 문자 타입이므로 charAt을 사용해 문자가 O 이면
                cnt++;  // 카운트를 늘려주고 (누적)
                sum += cnt;  // 그에 따라 카운트를 sum에 저장
            } else {  // 문자가 O가 아니면 즉 X 이면
                cnt = 0;  // 누적된 카운트 점수를 0으로 초기화
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Test_5 method = new Test_5();
        String s ="OXOOOXXXOXOOXOOOOOXO";
        System.out.println(method.solution(s));
    }
}