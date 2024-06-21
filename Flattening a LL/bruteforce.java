class GfG
{
    Node arrToLL(ArrayList<Integer> arr){
        Node dummyhead=new Node(-1);
        Node temp=dummyhead;
        for(int i=0;i<arr.size();i++){
            temp.bottom=new Node(arr.get(i));
            temp=temp.bottom;
        }
        return dummyhead.bottom;
    }
    Node flatten(Node root){
	    ArrayList<Integer> arr=new ArrayList<>();
	    while(root!=null){
	        Node temp=root;
	        while(temp!=null){
	            arr.add(temp.data);
	            temp=temp.bottom;
	        }
	        root=root.next;
	    }
	    Collections.sort(arr);
	    
	    return arrToLL(arr);
    }
}
