import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = "" + n;

        List<Long> list = new ArrayList<>();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            list.add(n % 10);
            n /= 10;
        }

        list.sort(Collections.reverseOrder());

        for (long num : list) {
            builder.append(num);
        }

        answer = Long.parseLong(builder.toString());
        
        return answer;
    }
}