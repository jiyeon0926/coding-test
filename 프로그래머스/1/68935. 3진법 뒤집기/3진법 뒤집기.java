class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String three = Integer.toString(n,3);
        String reverse = new StringBuilder(three).reverse().toString();
        answer = Integer.parseInt(reverse, 3);
        
        return answer;
    }
}