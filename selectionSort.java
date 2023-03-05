/*
Time Complexity Best Case ==  O(n**2)
Time Complexity Worst Case ==  O(n**2)
*/

package dsaCode;
import java.util.*;

public class selectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++){
            System.out.print("Enter value for a["+i+"]: ");
            a[i]=sc.nextInt();
        }

        int loc;
        for(int i=0;i<n-1;i++){
            loc = i;
            for(int j=i+1;j<n;j++){
                if (a[j] < a[loc]){
                    loc = j;
                }
            }
            int temp =a[i];
            a[i] = a[loc];
            a[loc] = temp;
        }

        System.out.print("Array is: ");
        for(int j=0;j<n;j++){
            System.out.print(a[j]+" ");
        }
    }
}
