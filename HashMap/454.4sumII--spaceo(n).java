class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int tuples = 0;
        int len = A.length;
        //Hash Set with Elements D
        Map<Integer,Integer> dhash = new HashMap<Integer, Integer>();
        for(int i = 0; i < len; i++){
            if(dhash.containsKey(D[i])){
                dhash.put(D[i], dhash.get(D[i]) + 1);
            }else{
                dhash.put(D[i],1);
            }
        }
        for(int i = 0; i < len; i++){
            int asum = A[i];
            for(int j = 0; j < len; j++){
                int bsum = asum + B[j];
                for(int k = 0; k < len; k++){
                    int csum = bsum + C[k];
                    if(dhash.containsKey(-csum)){
                        tuples = tuples + dhash.get(-csum);
                    }
                }
            }
        }
    return tuples;
    }
}
