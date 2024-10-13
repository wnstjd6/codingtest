#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// num_list_len은 배열 num_list의 길이입니다.
int solution(int num_list[],size_t num_list_len) {
    int answer = 0;
    int sum = 0;
    int s = 0;
    for(int i = 0; i<num_list_len; i++){
        if(i%2==0){
            sum+=num_list[i];
        }
        else{
            s+=num_list[i];
        }
    }
    if(s<sum){
        answer = sum;
    }
    else{
        answer = s;
    }
    return answer;
}