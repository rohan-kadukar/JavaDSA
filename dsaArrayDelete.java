package dsaCode;
import java.util.*;

public class dsaArrayDelete {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] array=new int[n-1];
        for (int i=0;i<n;i++){
            System.out.print("Enter Element for arr["+i+"]: ");
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter removing element index: ");
        int r=sc.nextInt();
        for (int j=0;j<(n-1);j++){
            if (j==r){
                array[j]=arr[j+1];
            } else if (j>r) {
                array[j]=arr[j+1];
            } else {
                array[j]=arr[j];
            }
        }
        for (int i=0;i<(n-1);i++){
            System.out.println(array[i]);
        }
    }
}
