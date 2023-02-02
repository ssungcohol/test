// 기원이는 오늘 항해99를 시작했다. 성격이 급한 기원이는 항해 1일 차부터 언제 수료를 하게될 지 궁금하다.
//
//항해 1일 차 날짜를 입력하면 98일 이후 항해를 수료하게 되는 날짜를 계산해주는 알고리즘을 만들어보자.

//### 제한 조건
//
// 1 ≤ month ≤ 12
// 1 ≤ day ≤ 31 (2월은 28일로 고정합니다, 즉 윤일은 고려하지 않습니다.)

// month    day     날짜
// 11       27      3월 5일
// 6        22      9월 28일

public class Test_1 {
    public String solution(int month, int day) {
        String answer = "";

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int total = 0;  // 전체 날짜
        int resultm = 0; // 반환해줄 달 변수
        int resultd = 0; // 반환해줄 날짜 변수

        total = total + (days[month-1] - day); // (days[month-1] - day) 는 처음 주어진 달과 날짜에서 남은 날짜를 계산

//        for(int i = month; total < 98; i++) { // 98일이 넘어갈 때까지 달에는 1을 추가하고, total에는 그 해당 달의 날짜를 추가
//            total += days[i];
//        }

        int i = month;
        while (total < 98) {  // for문을 while문으로 변경
            total += days[i];
            i++;
        }

//        if(i > 12){
//            resultm = i - 12;
//        } else {
//            resultm = i;
//        }

        resultm = i;

        resultd = days[resultm]-(total-97);  // 98일이 지난 시점의 해당 달 1일에서 날짜를 계산
        answer = resultm + "월" + resultd + "일" ;

        //==============================================================================

//        int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
//        int sum = 0;
//        int result1 = 0;
//        int result2 = 0;
//
//        for (int i = 1; i < month; i++) {  // 입력 달이 4월이면 1~3월까지 날짜수의 합
//            sum += months[i-1];
//        }
//
//        sum += day + 98;  // 입력받은 날짜와, 98일 후의 날짜
//
//        if (sum > 365)
//            sum = sum%365; //날짜 구하기 나머지
//
//        for (int i = 1; true ; i++) {
//            sum -= months[i-1];
//            if (sum < 0) {
//                result1 = i;
//                result2 += sum+months[i-1];
//                break;
//            }
//        }
//        answer = result1+"월 "+result2+"일";

        return answer;
    }

    public static void main(String[] args) {
        Test_1 method = new Test_1();
        System.out.println(method.solution(11, 27));
    }
}
