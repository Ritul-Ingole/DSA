class ListNode{
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

class Solution{
  public int addOneUntil(ListNode node){
    if(node == null) return 1;
    int carry = addOneUntil(node.next);
    int sum = node.val + carry;
    node.val = sum % 10;
    return sum / 10;
  }
  
  public ListNode addOne(ListNode head){
    int carry = addOneUntil(head);
    if(carry != 0){
      ListNode newHead = new ListNode(carry);
      newHead.next = head;
      head = newHead;
    };
    return head;
  }
}

public class Add1ToANumberInLL {
  public static void main(String[] args){
    LinkedList list = new LinkedList();
    list.insert(1);
    list.insert(2);
    list.insert(9);
    list.insert(9);
    list.insert(9);
    list.insert(9);
    System.out.print("Original Number: ");
    list.print();

    Solution sol = new Solution();
    ListNode newHead = sol.addOne(list.head);
    LinkedList newList = new LinkedList();
    newList.head = newHead;
    newList.print();
  }
}
