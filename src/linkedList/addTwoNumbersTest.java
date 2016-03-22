package linkedList;

import static org.junit.Assert.*;

import org.junit.Test;

public class addTwoNumbersTest {

	@Test
	public void testAdd() {
		ListNode l1 = new ListNode(9);
		ListNode p = l1;
		p.next = new ListNode(9);
		p = p.next;
		p.next = new ListNode(9);
		p = p.next;
		p.next = new ListNode(9);
		
		ListNode l2 = new ListNode(9);
		ListNode p2 = l2;
		p2.next = new ListNode(9);
		p2 = p2.next;
		p2.next = new ListNode(9);
		
		ListNode l3 = addTwoNumbers.add(l1,l2);
		int[] ans = new int[]{8,9,9,0,1};
		int i = 0;
		while(l3!=null){
			assertEquals(ans[i],l3.val);
			l3 = l3.next;
			i++;
		}
	}

}
