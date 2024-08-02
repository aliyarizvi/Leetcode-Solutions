import java.util.*;

class Main{
    public static int countSubstring(String str,int k){
        int res=0;
        int n=str.length();
        int count[]=new int[26];
        
        for(int i=0;i<n;i++){
            int dist_count=0;
            Arrays.fill(count,0);
            
            for(int j=i;j<n;j++){
                if(count[str.charAt(j)-'a']==0)
                dist_count++;
                
                count[str.charAt(j)-'a']++;
                
                if(dist_count==k)
                res++;
            }
        }
        return res;
    }
    
    public static void main(String Args[]){
        String str=new String("abaaca");
        int k=1;
        System.out.println(countSubstring(str,k));
        
    }
}
