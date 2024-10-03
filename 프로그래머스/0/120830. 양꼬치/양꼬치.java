class Solution {
    public int solution(int n, int k) {
       
        int a = 12000;
        int b = 2000;
        int answer = (a*n)+(b*k)-(n/10)*b;
        return answer;
    }
}