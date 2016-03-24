package linkedList;


public class addTwoNumbers {
	
	public static ListNode add(ListNode l1, ListNode l2){
		ListNode head = new ListNode(0);
		ListNode p = head;
		int carry = 0;
		while(l1 != null || l2!= null || carry!=0){
			ListNode cur = new ListNode(0);
			int sum = ((l1!=null)?l1.val:0) + ((l2!=null)?l2.val:0) + carry;
			cur.val = sum % 10;
			carry = sum / 10;
			p.next = cur;
			p = p.next;
			if(l1!=null) l1 = l1.next;
			if(l2!=null) l2 = l2.next;
		}
		return head.next;
	}
	
}
