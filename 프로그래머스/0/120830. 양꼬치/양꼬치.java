class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        if (n >= 10) {
            int a = n / 10;
            if (a >= 1) {
                answer = (12000 * n) + (2000 * (k - a));
            }
        } else {
            answer = 12000 * n + 2000 * k;
        }
        return answer;
    }
}