class Solution {
    public int solution(int[] sides) {
        int max = Math.max(sides[0], Math.max(sides[1], sides[2]));  // 가장 긴 변을 찾음
        int sum = 0;
        
        // 나머지 두 변의 합을 계산
        for (int side : sides) {
            sum += side;
        }
        sum -= max;  // 전체 합에서 가장 긴 변을 뺌

        // 조건을 확인
        if (max < sum) {
            return 1;  // 삼각형을 만들 수 있음
        } else {
            return 2;  // 삼각형을 만들 수 없음
        }
    }
}
