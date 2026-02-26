class Node{
  int data;
  Node next;

  Node(int val1){
    data = val1;
    next = null;
  }

  Node(int val1, Node next1){
    data = val1;
    next = next1;
  }
}


class Solution{
  public Node deleteTail(Node head){
    if(head == null || head.next == null) return null;

    Node curr = head;
    while(curr.next.next != null){
      curr = curr.next;
    }
    curr.next = null;
    return head;
  }
}

public class deletion{
  public static void main(String[] args){
    
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);

    Solution sol = new Solution();
    head = sol.deleteTail(head);

    System.out.println("After deletion List: ");

    Node temp = head;
    while(temp != null){
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }
}