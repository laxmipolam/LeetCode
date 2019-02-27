// 997. Find the Town Judge

class Solution {
    public int findJudge(int N, int[][] trust) {
        if(N == 1){
            return 1;
        }
        HashSet<Integer> trusting = new HashSet<Integer>();
        HashMap<Integer,Integer> beingtrust = new HashMap<Integer,Integer>();
        for(int i = 0; i < trust.length; i++){
            trusting.add(trust[i][0]);
            beingtrust.remove(trust[i][0]);
            if(!trusting.contains(trust[i][1])){
                if(beingtrust.containsKey(trust[i][1])){
                    int a = beingtrust.get(trust[i][1]) + 1;
                    beingtrust.put(trust[i][1], a) ;
                }else{
                    beingtrust.put(trust[i][1], 1) ;
                }
            }
        }
        for (HashMap.Entry<Integer, Integer> entry : beingtrust.entrySet()) {
            if(entry.getValue() == N-1){
                return entry.getKey();
            }
        }
         
        return -1;
    }
}