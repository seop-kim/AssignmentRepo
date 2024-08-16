package org.study.problem;

public class Problem4 {
    /**
     * @ 문제 : n보다 커질 때까지 더하기
     * <p>
     * 정수 배열 numbers와 정수 n이 매개변수로 주어집니다. numbers의 원소를 앞에서부터 하나씩 더하다가
     * 그 합이 n보다 커지는 순간 이때까지 더했던 원소들의 합을 return 하는 solution 함수를 작성해 주세요.
     */
    private static int solution(int[] numbers, int n) {
        int answer = 0;

        // TODO
        //  코드 구현 부분

        return answer;
    }

    public static void main(String[] args) {
        int result = 139;
        int answer = solution(new int[]{34, 5, 71, 29, 100, 34}, 123);
        if (result != answer) {
            throw new IllegalArgumentException("값이 일치하지 않습니다.");
        }

        result = 239;
        answer = solution(new int[]{58, 44, 27, 10, 100}, 139);
        if (result != answer) {
            throw new IllegalArgumentException("값이 일치하지 않습니다.");
        }
    }
}
