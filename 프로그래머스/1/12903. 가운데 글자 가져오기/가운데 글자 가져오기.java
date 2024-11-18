class Solution {
    public String solution(String s) {
        int len = s.length();
        String answer = "";

        if (len % 2 == 0) {
            int i = len / 2;
            int i2 = len / 2 - 1;
            answer = String.valueOf(s.charAt(i2)) + String.valueOf(s.charAt(i));
        } else {
            int i = len / 2;
            answer = String.valueOf(s.charAt(i));
        }
        
        return answer;
    }
}