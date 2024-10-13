class Solution {
    public int solution(int[] num_list) {
        int answer = 0;  // 합계용 변수
        int product = 1; // 곱셈용 변수
        
        // 조건에 따라 계산 방식 결정
        if (num_list.length >= 11) {
            // 11개 이상일 때는 모든 원소의 합을 구함
            for (int i = 0; i < num_list.length; i++) {
                answer += num_list[i];
            }
            return answer; // 합계 반환
        } else {
            // 10개 이하일 때는 모든 원소의 곱을 구함
            for (int i = 0; i < num_list.length; i++) {
                product *= num_list[i];
            }
            return product; // 곱 반환
        }
    }
}
