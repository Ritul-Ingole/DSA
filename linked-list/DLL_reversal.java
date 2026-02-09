import java.util.*;

class Node{
  int data;
  Node next;
  Node prev;

  Node(int data1, Node next1, Node prev1) {
    data = data1;
    next = next1;
    prev=prev1;
  }

  Node(int data1){
    data = data1;
    next = null;
    prev = null;
  }
}

class Solution{
  public static Node convertToDLL(int[] arr){
    Node head = new Node(arr[0]);
    Node prev = head;

    for(int i =1 ; i<arr.length; i++){
      Node temp = new Node(arr[i], null, prev);
      prev.next = temp; 
      prev = temp;
    }
    return head;
  }
  public static Node reverseDLL(Node head){
    if(head == null || head.next == null) return head;

    Node temp = head;
    Node last = null;
    while(temp!= null){
      Node nextNode = temp.next;
      temp.next= temp.prev;
      temp.prev= nextNode;
      last = temp;
      temp = nextNode;
    }
    return last;
  }
}

public class DLL_reversal {
  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] arr = {12,13,14,15,16,17};
    Node head = sol.convertToDLL(arr);
    head = sol.reverseDLL(head);
    System.out.println("After reversal list: ");
    while(head!= null){
      System.out.print(head.data + " ");
      head = head.next;
    }
  }
}