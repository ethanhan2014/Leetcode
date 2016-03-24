package linkedList;

public class MergeTwoLists {
	
	//recursive way
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1==null) return l2;
		if(l2==null) return l1;
		if(l1.val < l2.val){
			l1.next = mergeTwoLists(l1.next,l2);
			return l1;
		}else{
			l2.next = mergeTwoLists(l1,l2.next);
			return l2;
		}
	}
	
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode l3 = new ListNode(0);
//        ListNode p1 = l1;
//        ListNode p2 = l2;
//        ListNode p3 = l3;
//        while(p1!=null && p2!=null){
//        	if(p1.val < p2.val){
//        		p3.next = p1;
//        		p1 = p1.next;
//        	}else{
//        		p3.next = p2;
//        		p2 = p2.next;
//        	}
//        	p3 = p3.next;
//        }
//        if(p1 != null){
//        	p3.next = p1;
//        }
//        
//        if(p2 != null){
//        	p3.next = p2;
//        }
//        return l3.next;
//    }
}
