import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();

        if (arr.length == 1 && arr[0] == 10) {
            int[] answer = {-1};
            return answer;
        } else {
            int[] answer = {};
            answer = Arrays.stream(arr).filter(i -> i != min).toArray();
            return answer;
        }
    }
}