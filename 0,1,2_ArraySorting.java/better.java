//TC= N
//SC= N
import java.util.*;

public class Main {
    public static void sortArray(ArrayList<Integer> arr, int n) {
      int c0=0;
      int c1=0;
      int c2=0;
      for(int i=0; i<n; i++){
      if(arr.get(i)==0)
      c0++;
      
      else if(arr.get(i)==1)
      c1++;
      
      else 
      c2++;
      }
      for(int i=0;i<c0;i++){
         arr.set(i, 0);
      }
      for(int j=c0;j<c0+c1;j++){
          arr.set(j, 1);
      }
      for(int k=c0+c1;k<n;k++){
          arr.set(k, 2);
      }
    }


    public static void main(String args[]) {
        int n = 6;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
        sortArray(arr, n);
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

    }
    
}
