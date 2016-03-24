package linkedList;


public class RemoveNthFromEnd {
	
	   public ListNode removeNthFromEnd(ListNode head, int n) {

		    ListNode start = new ListNode(0);
		    ListNode slow = start, fast = start;
		    slow.next = head;

		    //Move fast in front so that the gap between slow and fast becomes n
		    for(int i=1; i<=n+1; i++)   {
		        fast = fast.next;
		    }
		    //Move fast to the end, maintaining the gap
		    while(fast != null) {
		        slow = slow.next;
		        fast = fast.next;
		    }
		    //Skip the desired node
		    slow.next = slow.next.next;
		    return start.next;
		}
	   
	//176 / 207 test cases passed.
//	public ListNode removeNthFromEnd(ListNode head, int n) {
//		ListNode prevH = new ListNode(0);
//		prevH.next = head;
//		ListNode prev= prevH;
//		ListNode cur = head;
//		ListNode end = head;
//		int i = n;
//		while(i>0){	
//			end = end.next;
//			i--;
//		}
//
//		while(end!=null){
//			prev = prev.next;
//			cur = cur.next;
//			end = end.next;
//		}
//		prev.next = cur.next;
//		
//        return head;
//    }
}
