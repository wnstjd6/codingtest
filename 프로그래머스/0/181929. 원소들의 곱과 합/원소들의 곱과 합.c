#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// num_list_len은 배열 num_list의 길이입니다.
int solution(int num_list[], size_t num_list_len) {
    int answer = 0;
    int sum = 0;
    int um = 1;
    for(int i =0; i<num_list_len; i++){
        sum+=num_list[i];
        um*=num_list[i];
    }
    if((sum*sum)>um){
        answer = 1;
    }
    else{
        answer = 0;
    }
    return answer;
}