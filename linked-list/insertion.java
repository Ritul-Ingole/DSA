class Node{
  int data;
  Node next;

  Node(int data1, Node next1){
    data= data1;
    next=next1;
  }

  Node(int data1){
    data= data1;
    next= null;
  }
}

class Solution{
  // function to insert node at head
  public Node insertAtHead(int newData, Node head){
    Node newNode = new Node(newData, head);
    return newNode;
  }

  //funtion to print the linked-list
  public void printList(Node head){
    Node temp = head;
    while(temp!= null){
      System.out.print(temp.data + " ");
      temp=temp.next;
    }
    System.out.println();
  }
}

public class insertion{
  public static void main(String[] args){
    Solution sol = new Solution();

    Node head = new Node(2);
    head.next= new Node(3);

    System.out.println("Original list: ");
    sol.printList(head);

    // inserting at head
    head = sol.insertAtHead(1, head);

    System.out.print("After Insertion: ");
    sol.printList(head);
  }
}