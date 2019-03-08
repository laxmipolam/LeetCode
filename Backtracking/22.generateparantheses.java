class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new LinkedList();
        help("(", n - 1, n - 1, 2 * n, ans);
        return ans;
    }
    public void help(String s, int i, int j, int n, List<String> ans){
        if(i == 0 && j == 0){
            ans.add(s + ')');
            return;
        }
        if(i > 0){
            help(s + '(',i - 1,j,n, ans);
        }
        
        if(j > 0 && i <= j){
            help(s + ')',i, j - 1 ,n, ans);
        }
        return;
    }
}