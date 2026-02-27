class ListNode{
  int val;
  ListNode next;

  ListNode(int val1){
    val = val1;
    next = null;
  }

  ListNode (int val1, ListNode next1){
    val = val1;
    next = next1;
  }
}

// class LinkedList{
//   ListNode head;

//   LinkedList(){
//     head = null;
//   }

//   void insert(int val){
//     ListNode newNode = new ListNode(val);
//     if(head == null){
//       head = newNode;
//       return;
//     }
//     ListNode temp = head;
//     while(temp != null){
//       temp = temp.next;
//     }
//     temp.next = newNode;
//   }

//   void print(){
//     ListNode temp = head;
//     while(temp != null){
//       System.out.print(temp.val);
//       if(temp.next != null) System.out.println("->");
//       temp = temp.next;
//     }
//     System.out.println("->NULL");
//   }
// };

class Solution{
  public void insertNode(ListNode head, int val) {
    ListNode newNode = new ListNode(val);
    if (head == null) {
        head = newNode;
        return;
    }
    ListNode temp = head;
    while (temp.next != null) {
        temp = temp.next;
    }
    temp.next = newNode;
  }

  public ListNode getInsertedSection(ListNode head1, ListNode head2){
    ListNode d1 = head1;
    ListNode d2 = head2;

    while(d1 != d2){
      d1 = (d1 == null) ? head2 : d1.next;
      d2 = (d2 == null) ? head1 : d2.next;
    }
    return d1;
  }

  public void printList(ListNode head) {
    while (head != null && head.next != null) {
        System.out.print(head.val + "->");
        head = head.next;
    }
    if (head != null) {
        System.out.print(head.val);
    }
    System.out.println();
  }
}


public class IntersectionOfTwoLL {
  public static void main(String[] args) {
        Solution sol = new Solution();

        // Creation of both lists
        ListNode head = new ListNode(1);
        sol.insertNode(head, 3);
        sol.insertNode(head, 1);
        sol.insertNode(head, 2);
        sol.insertNode(head, 4);
        ListNode head1 = head;
        head = head.next.next.next;  // Intersection point
        ListNode headSec = new ListNode(3);
        ListNode head2 = headSec;
        headSec.next = head;  // Creating intersection

        // Printing the lists
        System.out.print("List1: ");
        sol.printList(head1);
        System.out.print("List2: ");
        sol.printList(head2);

        // Checking if intersection is present
        ListNode answerNode = sol.getInsertedSection(head1, head2);
        if (answerNode == null) {
            System.out.println("No intersection");
        } else {
            System.out.println("The intersection point is " + answerNode.val);
        }
    }
}
