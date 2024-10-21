import java.time.Year;

class Solution {
    public int solution(int age) {
        int answer = 0;
        int year = Year.now().getValue();
        answer = year - age - 1;
        return answer;
    }
}