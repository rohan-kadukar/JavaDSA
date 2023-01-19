package dsaCode;
import java.util.*;

public class dsaArrayInsert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements for array: ");
        int n=sc.nextInt();
        //int arr[] = new int[5];
        int[] arr = new int[n];
        int []arr1=new int[n+1];
        for(int i=0;i<n;i++){
            System.out.print("Enter value for arr["+i+"]: ");
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter position of inserting element: ");
        int m=sc.nextInt();
        System.out.print("Enter the value: ");
        int value=sc.nextInt();
        for (int j=0;j<(n+1);j++){
            if (j==m){
                arr1[j]=value;
            } else if (j>=m) {
                arr1[j]=arr[j-1];
            } else{
                arr1[j]=arr[j];
            }

        }
        for(int i=0;i<(n+1);i++){
            System.out.println(arr1[i]+" ");
        }
    }
}
