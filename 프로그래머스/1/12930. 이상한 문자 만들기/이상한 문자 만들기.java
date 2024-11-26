class Solution {
    public String solution(String s) {
        String answer = "";

        String[] array = s.split("");

        int idx = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(" ")) {
                idx = 0;
            } else {
                if (idx % 2 == 0) {
                    idx++;
                    array[i] = array[i].toUpperCase();
                } else {
                    idx++;
                    array[i] = array[i].toLowerCase();
                }
            }

            answer += array[i];
        }
        
        return answer;
    }
}