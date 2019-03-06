class Solution {
    public int binaryGap(int N) {
        int i = 0;
        int diff = 0;
        while(true){
            if((N & 1) != 0){
                break;
            }
            N = N>>1;
            i++;
        }
        int j;
        j = i;
        while(N > 0){
             if((N & 1) != 0){
                if(diff < (j - i)){
                    diff = j - i;
                }
                 i = j;
            }
            N = N>> 1;
            j++;
        }
        return diff;
    }
}