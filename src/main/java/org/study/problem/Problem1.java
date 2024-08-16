package org.study.problem;

public class Problem1 {

    /**
     * @ 문제 : 숫자 비교하기
     * <p>
     * 정수 a와 b가 매개변수로 주어진다. 두 수가 같으면 1 다르면 -1을 return하는 로직을 구성하세요
     */
    private static int solution(int a, int b) {
        int answer = 1;

        // TODO
        //  코드 구현 부분

        return answer;
    }

    public static void main(String[] args) {
        int result = -1;
        int answer = solution(2, 3);
        if (result != answer) {
            throw new IllegalArgumentException("값이 일치하지 않습니다.");
        }
    }
}
