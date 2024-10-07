class Solution {
    public int solution(int a, int b) {
        int sum = 0;
        int answer = Integer.parseInt(Integer.toString(a)+Integer.toString(b));
        int answer2 = 2*a*b;
        if(answer>answer2)
            sum = answer;
        else{ 
            sum = answer2;
        }
           
        return sum;
    }
}