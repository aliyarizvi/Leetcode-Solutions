//using counters

class Solution {
    public String removeOuterParentheses(String s) {
        int count=0;
        StringBuilder sb=new StringBuilder();
        boolean flag=true;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(')
            count++;
            else
            count--;

            if(count==1 && flag==true){
                flag=false;
                continue;
            }
            if(count==0 && flag==false){
                flag=true;
                continue;
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}
