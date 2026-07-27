class Solution {
    public int titleToNumber(String c) {
        int r=0;
        for(int i=0;i<c.length();i++){
            r=r*26+(c.charAt(i)-'A'+1);
        }
        return r;
    }
}