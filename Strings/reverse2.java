public class Main
{
	public static void main(String[] args) {
		String str=new String("hello");
		char[] ch=str.toCharArray();
        int left=0;
        int right=ch.length-1;
        
        while(left<right){
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            
            left++;
            right--;
        }
        String s=new String(ch);
        System.out.println(s);
	}
}
