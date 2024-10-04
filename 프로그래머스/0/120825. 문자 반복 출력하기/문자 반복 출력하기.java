class Solution {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        
        // 문자열을 순회하며 각 문자를 n번 반복
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i); // 각 문자를 추출
            for (int j = 0; j < n; j++) {
                answer.append(ch); // 문자를 n번 반복하여 추가
            }
        }
        
        return answer.toString(); // StringBuilder를 문자열로 변환하여 반환
    }
}
