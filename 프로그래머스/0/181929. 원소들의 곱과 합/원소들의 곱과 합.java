class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int wo = 1;
        for(int i = 0; i<num_list.length; i++){
            wo*=num_list[i];
            sum += num_list[i];
            if(sum*sum>wo){
                answer = 1;
            }
            else if(sum*sum<wo){
                answer = 0;
            }
            
        }
        return answer;
    }
}