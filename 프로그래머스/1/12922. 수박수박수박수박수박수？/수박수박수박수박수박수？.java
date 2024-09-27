class Solution {
    public String solution(int n) {
        String answer = "";
        return "수박".repeat(n / 2) + "수".repeat(n % 2);//repeat 문자열 반복 함수
    }
}