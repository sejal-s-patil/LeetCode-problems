class Solution {
    public int lengthOfLastWord(String s) {
        int count=0, lastVal=0;
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                count++;
                lastVal=count;
            }
            else{
                count=0;
            }
        }
        if(count==0){
            return lastVal;
        }
            return count;
    }
}
