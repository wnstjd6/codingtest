class Solution {
    public int solution(String my_string) {
        int answer = 0;

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            // 숫자인지 확인한 후 숫자를 더함
            if (Character.isDigit(ch)) {
                answer += ch - '0'; // 문자 '0'을 빼면 실제 숫자가 됨
            }
        }
        
        return answer;
    }
}
