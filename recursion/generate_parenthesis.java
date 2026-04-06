// Brute Force Approach

// import java.util.*;

// class Solution{
//   public boolean isValid(String s){
//     int balance = 0;
//     for(char c : s.toCharArray()){
//       if(c == '(') balance++;
//       else balance--;
//       if(balance < 0) return false;
//     }
//     return balance == 0;
//   }

//   public void generate_brackets(int n, String curr, List<String> result){
//     if(curr.length() == 2 * n){
//       if(isValid(curr)){
//         result.add(curr);
//       }
//       return;
//     }
//     generate_brackets(n, curr + "(", result);
//     generate_brackets(n, curr + ")", result);
//   }

//   public List<String> generateParenthesis(int n){
//     List<String> result = new ArrayList<>();
//     generate_brackets(n, "", result);
//     return result;
//   }
// }

// public class generate_parenthesis {
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the number of pairs of parentheses to generate: ");
//     int n = sc.nextInt();
//     Solution sol = new Solution();
//     List<String> result = sol.generateParenthesis(n);
//     System.out.println("Generated parentheses: " + result);
//     sc.close();
//   }
// }


// Optimized Approach

import java.util.*;

class Solution {

    public void generate(int n, int open, int close, String curr, List<String> result) {
        if (curr.length() == 2 * n) {
            result.add(curr);
            return;
        }

        // Add '(' if we can
        if (open < n) {
            generate(n, open + 1, close, curr + "(", result);
        }

        // Add ')' only if valid
        if (close < open) {
            generate(n, open, close + 1, curr + ")", result);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(n, 0, 0, "", result);
        return result;
    }
}

public class generate_parenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        Solution sol = new Solution();
        List<String> result = sol.generateParenthesis(n);

        System.out.println(result);

        sc.close();
    }
}