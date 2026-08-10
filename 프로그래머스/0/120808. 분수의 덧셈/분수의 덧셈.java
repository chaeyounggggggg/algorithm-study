class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int a = numer1*denom2 + numer2*denom1;
        int b = denom1*denom2;
        
        int divnum = 1;
        for(int i = 1; i<=Math.min(a,b); i++){
            if(a%i==0 && b%i==0){
                divnum = i;
            }
        }
        
        answer[0] = a/divnum;
        answer[1] = b/divnum;
        
        return answer;
    }
}