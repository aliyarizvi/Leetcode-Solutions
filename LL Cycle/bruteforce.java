public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> st=new HashSet<>();
        ListNode temp=head;
        while(temp!=null){
            if(st.contains(temp))
            return true;
            else
            st.add(temp);
            temp=temp.next;
        }
        return false;
    }
}
