public class Main
{
	public static void main(String[] args) {
        String str="Aliya";
        StringBuilder sb=new StringBuilder(str);
        
        for(int i=0;i<sb.length()/2;i++){
        int f=0;
        int b=sb.length()-1-i;
        
        char front=sb.charAt(f);
        char back=sb.charAt(b);
        
        sb.setCharAt(f,back);
        sb.setCharAt(b,front);
        }
        System.out.println(sb.toString());
        
	}
}
