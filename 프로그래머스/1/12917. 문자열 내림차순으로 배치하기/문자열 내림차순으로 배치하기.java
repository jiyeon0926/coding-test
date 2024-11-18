import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] array = s.split("");

        Arrays.sort(array, Comparator.reverseOrder());

        answer = String.join("", array);
        
        return answer;
    }
}