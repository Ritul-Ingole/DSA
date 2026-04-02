import java.util.Stack;

class Solution{
  public void insert(Stack<Integer> stack, int temp){
    if(stack.isEmpty() || stack.peek() <= temp){
      stack.push(temp);
      return;
    }

    int val = stack.pop();
    insert(stack, temp);
    stack.push(val);
  }

  public void sortStack(Stack<Integer> stack){
    if(stack.isEmpty()){
      return;
    }
    int temp = stack.pop();
    sortStack(stack);
    insert(stack, temp);
  }
}

public class stack_soritng {
  public static void main(String[] args){
    Stack<Integer> stack = new Stack<>();
    stack.push(44);
    stack.push(3);
    stack.push(82);
    stack.push(47);
    stack.push(6);

    Solution sol = new Solution();
    sol.sortStack(stack);
    while(!stack.isEmpty()){
      System.out.print(stack.pop() + " ");
    }
  }
}
