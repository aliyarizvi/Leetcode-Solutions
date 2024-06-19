class Solution {
    public static Node tail(Node head){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        return temp;
    }
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        Node left=head;
        Node right=tail(head);
        
        while(left.data<right.data){
            if(left.data+right.data==target){
                ArrayList<Integer> pair=new ArrayList<>();
                pair.add(left.data);
                pair.add(right.data);
                arr.add(pair);
                left=left.next;
                right=right.prev;
            }
            else if(left.data+right.data<target)
            left=left.next;
            
            else
            right=right.prev;
        }
        return arr;
    }
}
