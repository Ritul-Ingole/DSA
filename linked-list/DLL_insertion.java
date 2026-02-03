class Node{
  int data;
  Node prev;
  Node next;

  Node(int data1, Node prev1, Node next1){
    data= data1;
    prev = prev1;
    next = next1;
  }

  Node(int data1){
    data = data1;
    prev = null;
    next = null;
  }
}

class Solution{
  public static Node convertArrToDLL(int[] arr){
    Node head = new Node(arr[0]);
    Node prev = head; 

    for(int i=1; i<arr.length; i++){
      Node temp = new Node(arr[i], prev, null);
      prev.next = temp;
      prev = temp;
    }
    return head;
  }

  public static void print(Node head){
    while (head != null ){
      System.out.print(head.data + " ");
      head = head.next;
    }
    System.out.println();
  }

  public static Node insertAtTail(Node head, int k){
    Node newNode = new Node(k);
    if(head == null) return newNode;

    Node temp = head;
    while(temp.next!= null) {
      temp = temp.next;
    }
    temp.next = newNode;
    newNode.prev = temp;
    return head;
  }
}

public class DLL_insertion{
  public static void main(String[] args){
    Solution sol = new Solution();

    int[] arr = {12, 3,4,55,67,4};
    Node head = sol.convertArrToDLL(arr);

    System.out.println("Initial Doubly Linked List: ");
    sol.print(head);

    System.out.println("After insertion at tail: ");
    head = sol.insertAtTail(head, 17);
    sol.print(head);
  }
}


