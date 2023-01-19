package dsaCode;
import java.util.*;

class addArray{
  public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter size of Array: ");
    int n=sc.nextInt();
    int[] arr=new int[n];
    int[] arrr=new int[n+1];
    for (int i=0;i<n ; i++) {
      System.out.println("Enter value for arr["+i+"]");
      arr[i]=sc.nextInt();
    }
    System.out.print("Enter index for adding new value: ");
    int m=sc.nextInt();
    System.out.print("Enter value: ");
    int val=sc.nextInt();
    for (int j=0;j<=n ; j++) {
      if (j==m) {
        arrr[j]=val;
      }
      else if(j>m){
        arrr[j]=arr[j-1];
      }
      else{
        arrr[j]=arr[j];
      }
    }
    for (int i=0; i<=n;i++ ) {
      System.out.println(arrr[i]);
    }
    
  }
}