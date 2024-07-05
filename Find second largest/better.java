class Main
{
static private void getElements(int[] arr, int n)
{
    int largest=arr[0];
    
    for(int i=0;i<n;i++){
        if(arr[i]>largest)
        largest=arr[i];
    }
    
    int sl=-1;
    for(int i=0;i<n;i++){
        if(arr[i]>sl && arr[i]!=largest)
        sl=arr[i];
    }
	System.out.println("Second largest is "+sl);
}
public static void main(String[] args)
{
	int[] arr = {1, 2, 4, 6, 7, 5};
	int n = arr.length;
	getElements(arr, n);
}
}
