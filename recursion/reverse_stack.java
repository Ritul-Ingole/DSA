import java.util.*;

class Solution{
  public static void insertAtBottom(Stack<Integer> stack, int val){
    if(stack.isEmpty()){
      stack.push(val);
      return;
    }

    int topVal = stack.pop();
    insertAtBottom(stack, val);
    stack.push(topVal);
  }

  public static void reverseStack(Stack<Integer> stack){
    if(stack.isEmpty()) return;

    int topVal = stack.pop();
    reverseStack(stack);
    insertAtBottom(stack, topVal);
  }
};

public class reverse_stack {
  public static void main(String[] args){
    Stack<Integer> stack = new Stack<>();
    stack.push(44);
    stack.push(3);
    stack.push(82);
    stack.push(47);
    stack.push(6);
    stack.push(15);
    
    Solution sol = new Solution();
    sol.reverseStack(stack);
    
    while(!stack.isEmpty()){
      System.out.print(stack.pop() + " ");
    }
  }
}