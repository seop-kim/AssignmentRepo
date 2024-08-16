package org.study.problem;

public class Problem {
    /**
     * @ 문제 : 암호 해독
     * <p>
     * 군 전략가 머쓱이는 전쟁 중 적군이 다음과 같은 암호 체계를 사용한다는 것을 알아냈습니다.
     *
     * - 암호화된 문자열 cipher를 주고받습니다.
     * - 그 문자열에서 code의 배수 번째 글자만 진짜 암호입니다.
     *
     * 문자열 cipher와 정수 code가 매개변수로 주어질 때 해독된 암호 문자열을 return하도록 solution 함수를 완성해주세요.
     */
    private static String solution(String cipher, int code) {
        String answer = "";

        // TODO
        //  코드 구현 부분

        return answer;
    }

    public static void main(String[] args) {
        String result = "attack";
        String answer = solution("dfjardstddetckdaccccdegk", 4);
        if (!result.equals(answer)) {
            throw new IllegalArgumentException("값이 일치하지 않습니다.");
        }

        result = "fallback";
        answer = solution("pfqallllabwaoclk", 2);
        if (!result.equals(answer)) {
            throw new IllegalArgumentException("값이 일치하지 않습니다.");
        }
    }
}
