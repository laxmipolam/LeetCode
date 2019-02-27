class Solution {
    public static int evalRPN(String[] tokens) {
        int[] s = new int[tokens.length];
        int count = -1;
        for (String token : tokens) {
            switch(token){
                case "+":
                     count--;
                    s[count] = (s[count] + s[count+1]);
                    break;
                 case "/":
                    count--;
                    s[count] = (s[count] / s[count+1]);
                    break;
                 case "-":
                    count--;
                    s[count] = (s[count] - s[count+1]);
                    break;
                 case "*":
                   count--;
                    s[count] = (s[count] * s[count+1]);
                    break;
                default:
                    count++;
                    s[count] = Integer.parseInt(token);
            }
        }
        return s[count];
    }
}