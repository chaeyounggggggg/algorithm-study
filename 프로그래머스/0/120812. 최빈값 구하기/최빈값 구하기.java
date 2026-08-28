class Solution {
    public int solution(int[] array) {
        int[] count = new int[1000];
        int max = 0;
        int maxnum = -1;
        for(int i = 0; i<array.length; i++){
            count[array[i]]++;
        }
        
        for(int i = 0; i<count.length; i++){
            if(count[i]>max){
                max = count[i];
                maxnum = i;
            }else if(count[i]==max)
                maxnum = -1;
        }
        
        return maxnum;
    }
}