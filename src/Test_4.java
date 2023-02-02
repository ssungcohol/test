public class Test_4 {
    public int solution(int num1) {
        int money = 1000;  // 르탄이가 가지고 있는 돈
        int change = money - num1;  // 거스름돈
        int[] coin = new int[] {500, 100, 50, 10};  //편의점 동전 종류
        int allCoin = 0;  // 거스름돈의 동전 개수

        for (int i = 0; i < coin.length; i++) {  // 동전의 개수만큼의 반복문 (종류별로 주어야하니까)
            if (change >= coin[i]) {  // 거스름 돈이 동전보다 크면 조건을 준 뒤
                allCoin += change / coin[i];  //  동전의 개수에는 i 번째 동전으로 거스름돈을 나눈 몫을 저장해주고
                change = change % coin[i];  // 거스름돈에는 i번째로 나눈 나머지 거스름돈을 저장해서 반복문을 반복
            }
        }

        return allCoin;
    }

    public static void main(String[] args) {
        Test_4 method = new Test_4();
        int num1 = 160;
        System.out.println(method.solution(num1));
    }
}
