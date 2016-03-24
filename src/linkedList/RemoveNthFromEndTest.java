package linkedList;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemoveNthFromEndTest {

	@Test
	public void testRemoveNthFromEnd() {
		RemoveNthFromEnd sol = new RemoveNthFromEnd();
		ListNode ans = new ListNode(1);
		ListNode p = ans;
		p.next = new ListNode(2);
		p = p.next;
		p.next = new ListNode(3);
		p = p.next;
		p.next = new ListNode(5);
		
		ListNode input = new ListNode(1);
		ListNode p1 = input;
		p1.next = new ListNode(2);
		p1 = p1.next;
		p1.next = new ListNode(3);
		p1 = p1.next;
		p1.next = new ListNode(4);
		p1 = p1.next;
		p1.next = new ListNode(5);
		
		assertEquals(ans,sol.removeNthFromEnd(input, 2));
	}

}
