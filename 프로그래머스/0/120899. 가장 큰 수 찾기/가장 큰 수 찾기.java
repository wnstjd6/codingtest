class Solution {
    public int[] solution(int[] array) {
      
        int max = 0;
        int a = 0;
        for(int i = 0; i<array.length; i++){
            if(max<array[i]){max=array[i]; a=i;}
            
            
            
        }
        int[] answer = {max,a};
        return answer;
    }
}