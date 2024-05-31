class Solution{
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> ans= new ArrayList<>();
        int max=arr[n-1];
        
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=max){
                ans.add(0,arr[i]); 
                max=arr[i];
            }
        }
        return ans; //ans is in descending order
    }
}
