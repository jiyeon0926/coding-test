class Solution {
    public int solution(int[] numbers) {
        int[] array = new int[10];
        int answer = 0;

        for (int i = 0; i < 10; i++) {
            array[i] = i;
        }

        for (int i = 0; i < array.length; i++) {
            boolean found = false;

            for (int num : numbers) {
                if (array[i] == num) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                answer += array[i];
            }
        }
        
        return answer;
    }
}