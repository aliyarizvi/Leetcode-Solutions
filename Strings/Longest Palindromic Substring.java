class Solution {
    int max;
    int start=0;
    int end=0;
    public boolean isPalindrome(String s,int left,int right){
        while(left<right){
            if(s.charAt(left)!=(s.charAt(right)))
            return false;
            left++;
            right--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindrome(s,i,j)==true){
                    if((j-i+1)>max){
                        max=j-i+1;
                        start=i;
                        end=j;
                    }
                }
            }
        }
        return s.substring(start,end+1);
    }
}
