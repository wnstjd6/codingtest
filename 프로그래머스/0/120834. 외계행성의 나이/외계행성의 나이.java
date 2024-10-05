class Solution {
	public String solution(int age) {
    	String answer = "";
        String age962 = "abcdefghij";
        String[] ageArr = String.valueOf(age).split(""); // age가 49이면 이 숫자의 문자열 ""을 잘라 "4","9"로 만들어준다       
        for (int i = 0; i < ageArr.length; i++) {
        	answer += age962.charAt(Integer.valueOf(ageArr[i]));
		}
        return answer;
    }
}