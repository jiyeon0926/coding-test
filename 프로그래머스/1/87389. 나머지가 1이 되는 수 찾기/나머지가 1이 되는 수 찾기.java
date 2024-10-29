import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int n) {
        List<Integer> list = new ArrayList<>();
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            if (3 <= n) {
                if (n % i == 1) {
                    list.add(i);
                }
            }
        }
        
        answer = list.stream().min(Integer::compare).get();
        
        return answer;
    }
}