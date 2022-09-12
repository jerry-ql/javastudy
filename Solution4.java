class Solution4 {
    public int lengthOfLastWord(String s) {
        int begin=0, end=0, index=1;
        while(index < s.length()) {
            if(s.charAt(index) != ' ') {
                if(s.charAt(index-1) == ' ') {
                    begin = index;
                }
                end = index;
            }
            index++;
        }
        return end-begin+1;
    }
}    