class Node {
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
  public static Node convertToDLL(int[] arr){
    Node head = new Node(arr[0]);
    Node prev = head;

    for(int i=1; i<arr.length; i++){
      Node temp = new Node(arr[i], prev, null);
      prev.next = temp;
      prev = temp;
    }
    return head;
  }

  public static Node deleteTail(Node head){
    if(head == null || head.next == null) return null;

    Node temp = head;
    while(temp.next != null){
      temp = temp.next;
    }
    temp.prev.next = null;
    temp.prev = null;
    return head;
  }
}

public class DLL_deletion{
  public static void main(String[] args){
    Solution sol = new Solution();
    int[] arr = {12,13,14,15,16};
    Node head = sol.convertToDLL(arr);
    head = sol.deleteTail(head);
    System.out.println("After deletion list: ");
    while(head != null){
      System.out.print(head.data + " ");
      head = head.next;
    }
    }
  }