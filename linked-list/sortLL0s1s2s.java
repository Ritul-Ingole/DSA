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
    while(temp.next !=   null){
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

class Solution{
  public void sortList(LinkedList list){

    ListNode dummy1 = new ListNode(-1);
    ListNode dummy2 = new ListNode(-1);
    ListNode dummy0 = new ListNode(-1);

    ListNode tail1 = dummy1;
    ListNode tail2 = dummy2;
    ListNode tail0 = dummy0;

    ListNode temp = list.head;

    while(temp != null){
      if(temp.val == 0){
        tail0.next = new ListNode(0);
        tail0 = tail0.next;
      }else if(temp.val == 1){
        tail1.next = new ListNode(1);
        tail1 = tail1.next;
      }else{
        tail2.next = new ListNode(2);
        tail2 = tail2.next;
      }

      temp = temp.next;
    }

    tail0.next = (dummy1.next != null) ? dummy1.next : dummy2.next;
    tail1.next = dummy2.next;
    tail2.next = null;

    list.head = dummy0.next;
  }
}

public class sortLL0s1s2s {
  public static void main(String[] args){
    LinkedList list = new LinkedList();
    Solution sol = new Solution();

    list.insert(1);
    list.insert(1);
    list.insert(2);
    list.insert(0);
    list.insert(1);
    list.insert(2);
    list.insert(0);

    System.out.println("Original list: ");
    list.print();

    sol.sortList(list);

    System.out.println("Sorted list: ");
    list.print();
  }
}
