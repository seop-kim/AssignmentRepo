package org.study.problem;

public class Problem2 {
    /**
     * @ 문제 : 머쓱이보다 키 큰 사람
     * <p>
     * 머쓱이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다.
     * 머쓱이네 반 친구들의 키가 담긴 정수 배열 array와 머쓱이의 키 height가 매개변수로 주어질 때,
     * 머쓱이보다 키 큰 사람 수를 return 하도록 solution 함수를 완성해보세요.
     */
    private static int solution(int[] array, int height) {
        int answer = 0;

        // TODO
        //  코드 구현 부분

        return answer;
    }

    public static void main(String[] args) {
        int result = 3;
        int answer = solution(new int[]{149, 180, 192, 170} , 167);
        if (result != answer) {
            throw new IllegalArgumentException("값이 일치하지 않습니다.");
        }

        result = 0;
        answer = solution(new int[]{180, 120, 140} , 190);
        if (result != answer) {
            throw new IllegalArgumentException("값이 일치하지 않습니다.");
        }
    }
}
