import java.util.*;
public class Main
{
	public static void main(String[] args) {
    int num1=2;
    int num2=7;
    
    String str1=Integer.toBinaryString(num1);
    System.out.println(str1);
    String str2=Integer.toBinaryString(num2);
    System.out.println(str2);
    
    int maxi=Math.max(str1.length(),str2.length());
    str1=String.format("%"+maxi+"s",str1).replace(' ','0');
    str2=String.format("%"+maxi+"s",str2).replace(' ','0');
    
    int c=0;
   for(int i=0;i<maxi;i++){
       if(str1.charAt(i)!=str2.charAt(i))
       c++;
   }
   System.out.println(c);
	}
}
