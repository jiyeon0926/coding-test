import java.util.*;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int n = x;

        List<Integer> list = new ArrayList<>();

        while (x > 0) {
            list.add(x % 10);
            x /= 10;
        }

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        if (n % sum != 0) {
            answer = false;
        }
        
        return answer;
    }
}