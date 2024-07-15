class Solution {
    public String largestOddNumber(String num) {
        int l=num.length();

        while(l-->0){
            int x=num.charAt(l)-'0';
            if(x%2!=0)
            return num.substring(0,l+1);
        }
        return "";
    }
}
