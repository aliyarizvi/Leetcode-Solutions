class Solution {
    public String toLowerCase(String s) {
        char arr[]=s.toCharArray();
        int val=0;
        int n=arr.length;
        for(int i=0; i<n; i++){
            val= arr[i];
            if( 64 < val && val < 91)
            val+=32;

            arr[i]= (char)val;
        }
        String str =  new String(arr);
        return str;
    }
}
