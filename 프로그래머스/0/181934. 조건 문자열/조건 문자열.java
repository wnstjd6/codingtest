class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        String a = ineq+eq;
        if(a.equals("<=")){
            if(n<=m){
                answer = 1;
            }
        }
         if(a.equals(">=")){
            if(n>=m){
                answer = 1;
            }
        }
         if(a.equals(">!")){
            if(n>m){
                answer = 1;
            }
            else{
                answer = 0;
            }
        }
        if(a.equals("<!")){
            if(n<m){
                answer = 1;
            }
            else{
                answer = 0;
            }
        }
          return answer;
    }
}