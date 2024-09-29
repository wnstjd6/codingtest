class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = 0;
        int max2 = 0;
        int index = 0;
        for(int i = 0; i<numbers.length; i++){
          
                if(max<numbers[i]){max=numbers[i];
                 index = i;   
                }
                 
            }  
        for(int j = 0; j<numbers.length; j++){
            if(j!=index&&max2<numbers[j])max2=numbers[j];
               
        }
        answer = max*max2;
        return answer;
    }
}