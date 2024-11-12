import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> result = new ArrayList<>();
        boolean add = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                result.add(arr[i]);
                Collections.sort(result);
                add = true;
            }
        }

        if (!add) {
            result.add(-1);
        }

        answer = result.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}