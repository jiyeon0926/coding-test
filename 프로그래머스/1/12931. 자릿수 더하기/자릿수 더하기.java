import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();

        while (n > 0) {
            list.add(n % 10);
            n /= 10; 
        }
        
        for (int num : list) {
            answer += num;
        }

        return answer;
    }
}