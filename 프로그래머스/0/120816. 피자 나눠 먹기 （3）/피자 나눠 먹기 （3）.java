class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        return (int)(n + (slice - 1)) / slice;
    }
}