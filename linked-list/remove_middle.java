class ListNode {
  int val;
  ListNode next;

  ListNode(int val1){
    val = val1;
    next = null;
  }
  
  ListNode(int val1, ListNode next1){
    val = val1;
    next = next1;
  }
}

class Solution{
  public ListNode deleteMiddle(ListNode head){
    if(head == null || head.next == null) return null;

    ListNode slow = head;
    ListNode fast = head;
    ListNode prev = null;

    while(fast != null && fast.next != null){
      prev = slow;
      slow = slow.next;
      fast = fast.next.next;
    }
    prev.next = slow.next;
    return head;
  }
}

public class remove_middle {
  
}
