class Node{
  int data;
  Node next;
  Node prev;

  Node(int data1){
    data =data1;
    next = null;
    prev = null;
  }

  Node(int data1, Node next1, Node prev1){
    data = data1;
    next= next1;
    prev = prev1;
  }
}

class Solution{

  public Node convertArrayToDLL(int[] arr){
    Node head = new Node(arr[0]);
    Node prev = head;

    for(int i = 0; i < arr.length; i++){
      Node newNode = new Node(arr[i], null, prev);
      prev.next = newNode;
      prev = newNode;
    }
    return head;
  }

  public void print(Node head){
    while(head !=null){
      System.out.print(head.data + " ");
      head = head.next;
    }
    System.out.println();
  }

  public void deleteDuplicate(Node head){
    if(head == null) return;
    Node curr = head;
    while(curr != null){
      Node temp = curr.next;
      while(temp != null && curr.data == temp.data){
        temp = temp.next;
      }
      curr.next = temp;
      if(temp != null){
        temp.prev = curr;
      }
      curr = temp;
    }
  }

}

public class DLL_duplicate_deletion {
  public static void main(String[] args) {
      Solution sol = new Solution();
      
      int[] arr = {1,1,3,3,3,5,6};
      Node head = sol.convertArrayToDLL(arr);

      System.out.println("Initial DLL:");
      sol.print(head);

      System.out.println("After removal of duplicate nodes:");
      sol.deleteDuplicate(head);
      sol.print(head);
  }}