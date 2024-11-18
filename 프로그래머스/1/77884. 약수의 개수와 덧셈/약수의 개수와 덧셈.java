import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            list.add(i);
        }

        for (int num : list) {
            int count = 0;

            for (int j = 1; j <= num; j++) {
                if (num % j == 0) {
                    count++;
                }
            }

            if (count % 2 == 0) {
                answer += num;
            } else {
                answer -= num;
            }
        }
        
        return answer;
    }
}