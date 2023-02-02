public class  Test_3{
    public static boolean[] prime; // 소수판별 저장 배열
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");  // 입력받은 문자열 s를 공백으로 분리해 배열 num에 입력
        int max = -1; // 최댓값이 들어갈 변수 (소수)
        int min = -1; // 최솟값이 들어갈 변수 (소수 x)
        boolean sosu = true;

//        // 문자열 배열 str을 int 배열로 변환하여 저장
//        for (int i = 0; i < str.length; i++) {
//            num[i] = Integer.parseInt(str[i]);
//        }
        // 소수 구하기
//        for (int i = 0; i < num.length; i++) {}

//        ==============================================
        // 중첩 for문을 사용한 오름차순 정리
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (Integer.parseInt(str[i]) > Integer.parseInt(str[j])) {
                    String tmp = str[i];
                    str[i] = str[j];
                    str[j] = tmp;
                }
            }
        }

        //소수를 찾으면서 최대 최소를 비교하면 오름차순 정리가 필요 없어짐

        for (int i = 0; i < str.length; i++) {
            for (int j = 2; j < Integer.parseInt(str[i]); j++) {
                // 모든 수는 1과 자기자신으로 나누어지기에 2부터 자기자신 -1 까지 for문 반복
                if (Integer.parseInt(str[i]) % j == 0) { // str i 번쨰 수가 j로 나누어 떨어진다면
                    sosu = false; // 소수가 아니다.
                    break;  // 안쪽 반복문 탈출
                }
            }
            if (sosu) { //소수이면
                if (max <= Integer.parseInt(str[i]))  // 현재값과 max 값을 비교해
                    max = Integer.parseInt(str[i]); // 큰 값을 max에 넣음

            } else { //소수가 아니면
                if (min >= Integer.parseInt(str[i]) || min == -1) // -1을 넣은 이유는 현재 값과 min 값을 비교하기 위해
                    min = Integer.parseInt(str[i]);
                }
            sosu = true; //소수 초기화
        }
        answer += min + " " + max;
        return answer;
    }


    public static void main (String[] args) {
        Test_3 method = new Test_3();
        String s = "97 75 88 99 95 92 73";
        System.out.println(method.solution(s));
    }
}
