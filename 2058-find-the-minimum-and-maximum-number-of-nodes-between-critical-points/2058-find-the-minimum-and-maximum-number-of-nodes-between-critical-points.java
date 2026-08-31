/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer> arr= new ArrayList<>();
        ListNode prev= head;
        ListNode curr= head.next;
        int index=-1;

        while(curr.next !=null){
            ListNode next= curr.next;

            boolean isMin= curr.val< prev.val && curr.val< next.val;
            boolean isMax= curr.val> prev.val && curr.val> next.val;

            if(isMin || isMax)arr.add(index);

            prev= curr;
            curr=next;
            index++;
        }
        if( arr.size()<2) return new int[]{-1,-1};

        int mindis= Integer.MAX_VALUE;

        for(int i=1;i< arr.size();i++){
            int dis= arr.get(i)-arr.get(i-1);
            mindis= Math.min(dis, mindis);
        }
        int maxdis= arr.get(arr.size()-1)-arr.get(0);

        return new int[]{mindis, maxdis};
        
    }
}