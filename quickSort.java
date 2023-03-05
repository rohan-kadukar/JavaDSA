/*
Time Complexity Best Case ==  O(nlogn)
Time Complexity Average Case ==  O(nlogn)
Time Complexity Worst Case ==  O(n**2)
*/

package dsaCode;
import java.util.*;
class sorting{
    int partition (int[] a, int start, int end) {
        int pivot = a[end];
        int i = (start - 1);
        for (int j = start; j <= end - 1; j++)
        {
            if (a[j] < pivot) {
                i++;
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        int t = a[i+1];
        a[i+1] = a[end];
        a[end] = t;
        return (i + 1);
    }
    void quick(int[] a, int start, int end){
        if (start < end){
            int p = partition(a,start,end);
            quick(a,start,p-1);
            quick(a,p+1,end);
        }
    }
}
public class quickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++){
            System.out.print("Enter value for a["+i+"]: ");
            a[i]=sc.nextInt();
        }

        sorting s = new sorting();
        s.quick(a,0,n-1);

        System.out.print("Array is: ");
        for(int j=0;j<n;j++){
            System.out.print(a[j]+" ");
        }
    }
}
