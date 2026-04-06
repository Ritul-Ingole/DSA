import java.util.*;


class Solution{
  static void generateBinaryString(int n, String curr, List<String> result){
    if(curr.length() == n){
      result.add(curr);
      return;
    }

    generateBinaryString(n, curr + "0", result);

    if(curr.isEmpty() || curr.charAt(curr.length() - 1) != '1'){
      generateBinaryString(n, curr + "1", result);
    }
  }
}

public class generate_binary_string{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of binary strings to generate: ");
    int n = sc.nextInt();
    Solution sol = new Solution();
    List<String> result = new ArrayList<>();
    sol.generateBinaryString(n, "", result);

    for(String s : result){
      System.out.print(s + " ");
    }
    System.out.println();
    sc.close();
  }

}