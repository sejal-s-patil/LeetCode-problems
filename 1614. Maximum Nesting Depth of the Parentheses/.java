class Solution {
    public int maxDepth(String s) {
        int curr=0;
        int maxDepth=0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='('){
                curr++;
            maxDepth = Math.max(maxDepth, curr);
            }
            else if(s.charAt(i)==')')
            curr--;

        }
        return maxDepth;
    }
}
