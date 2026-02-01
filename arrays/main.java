
class Solution{
  // Function to check if the array is sorted
  public boolean isSorted(int arr[], int n){
    for (int i=0; i<n; i++){
      for(int j=i+1; j<n; j++){
        if(arr[i] > arr[j]) return false;
      }
    }
    return true;
  };
}
public class main{
  public static void main(String[] args) {
      Solution sol = new Solution();
      int arr[] = {23,44,44,45,300};
      int n =arr.length;
      boolean ans = sol.isSorted(arr, n);
      if(ans) System.out.println("The given array is sorted!");
      else System.out.println("The given array is not sorted!");
  }
}