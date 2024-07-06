import java.util.*;

class Main{
static void solve(int arr[], int n) {
int temp=arr[0];
for(int i=0;i<n-1;i++){
    arr[i]=arr[i+1];
    System.out.print(arr[i]+" ");
}
    arr[n-1]=temp;
    System.out.print(arr[n-1]);
}
public static void main(String args[]) {
  int n=5;
  
  int arr[]= {1,2,3,4,5};
  solve(arr, n);
}
}
