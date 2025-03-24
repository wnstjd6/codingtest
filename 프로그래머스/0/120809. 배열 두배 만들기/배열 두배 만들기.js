function solution(numbers) {
    var answer = [numbers.length];
    for(let i = 0; i<numbers.length; i++){
        answer[i] = numbers[i]*2;
    }
    
    return answer;
}