class Solution {
    public int solution(long num) {
        int answer = 0;
        int count = 0;
        
        if (num == 1) {
            answer = count;
        } else {
            while (true) {
                if (num % 2 == 0) {
                    num /= 2;
                } else {
                    num = num * 3 + 1;
                }
                
                count++;
                
                if (count >= 500) {
                    answer = -1;
                    break;
                }
                
                if (num == 1) {
                    answer = count;
                    break;
                }
            }
        }
        
        return answer;
    }
}