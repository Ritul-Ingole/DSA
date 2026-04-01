class ListNode{
  int val;
  ListNode next;

  ListNode(int val1){
    val = val1;
    next = null;
  }

  ListNode(int val1, ListNode next1){
    val = val1;
    next= next1;
  }
}

class LinkedList{
  ListNode head;

  LinkedList(){
    head = null;
  }

  void insert(int val){
    ListNode newNode = new ListNode(val);
    if(head == null){
      head = newNode;
      return;
    }
    ListNode temp = head;
    while(temp.next != null){
      temp = temp.next;
    }
    temp.next = newNode;
  }
  void print(){
    ListNode temp = head;
    while(temp != null){
      System.out.print(temp.val);
      if(temp.next != null) System.out.print("->");
      temp = temp.next;
    }
    System.out.println("->NULL");
  }
}

class Solution {
    public ListNode swapPairs(ListNode head) {
      if (head == null) return null;

      ListNode dummy = new ListNode(0, head);
      ListNode prev = dummy, curr = head;

      while(curr != null && curr.next != null){
        ListNode npn = curr.next.next;
        ListNode second = curr.next;

        second.next = curr;
        curr.next = npn;
        prev.next = second;

        prev = curr;
        curr = npn;
      }
      return dummy.next;
    }
}
public class Swap_Nodes {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.insert(1);
    list.insert(2);
    list.insert(3);
    list.insert(4);
    System.out.println("Original List:");
    list.print();

    Solution obj = new Solution();
    list.head = obj.swapPairs(list.head);

    System.out.println("Swapped List:");
    list.print();
  }
}
