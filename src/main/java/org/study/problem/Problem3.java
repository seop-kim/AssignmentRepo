package org.study.problem;

public class Problem3 {
    /**
     * @ 문제 : 옷가게 할인 받기
     * <p>
     * 머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
     * 구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
     */
    private static int solution(int price) {
        int answer = 0;

        // TODO
        //  코드 구현 부분

        return answer;
    }

    public static void main(String[] args) {
        int result = 142_500;
        int answer = solution(150_000);
        if (result != answer) {
            throw new IllegalArgumentException("값이 일치하지 않습니다.");
        }

        result = 580_000;
        answer = solution(464_000);
        if (result != answer) {
            throw new IllegalArgumentException("값이 일치하지 않습니다.");
        }
    }
}
