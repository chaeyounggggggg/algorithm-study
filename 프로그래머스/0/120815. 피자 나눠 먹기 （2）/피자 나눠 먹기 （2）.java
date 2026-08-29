class Solution {
    public int solution(int n) {
        // int answer = 0;
        // if(n%6==0)
        //     answer = n/6;
        // else{
        //     for(int i=1;i<100;i++){
        //         if((6*i)%n==0)
        //             return i;
        //     }
        // }
        // return answer;
        
        
        int answer = n/gcd(n,6);
        
        return answer;
        
    }
    
    int gcd(int a, int b) {
            int gcd = 1;
            for(int i=1;i<=Math.min(a,b);i++){
                    if(a%i==0&&b%i==0){
                    gcd = i;
                }
            }
	        return gcd;
        }
}