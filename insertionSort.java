/*
Time Complexity Best Case ==  O(n)
Time Complexity Worst Case ==  O(n**2)
*/

package dsaCode;
import java.util.*;
public class insertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++){
            System.out.print("Enter value for a["+i+"]: ");
            a[i]=sc.nextInt();
        }

        for (int i = 1; i < n; ++i) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }

        System.out.print("Array is: ");
        for(int j=0;j<n;j++){
            System.out.print(a[j]+" ");
        }
    }
}
