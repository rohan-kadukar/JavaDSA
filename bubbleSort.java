/*
Time Complexity Best Case ==  O(n)
Time Complexity Worst Case ==  O(n**2)
*/

package dsaCode;
import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++){
            System.out.print("Enter value for a["+i+"]: ");
            a[i]=sc.nextInt();
        }

        for (int k=0;k<n-1;k++){
            for (int l=0;l<n-k-1;l++){
                if (a[l] > a[l+1]){
                    int temp = a[l];
                    a[l] = a[l+1];
                    a[l+1] = temp;
                }
            }
        }

        System.out.print("Array is: ");
        for(int j=0;j<n;j++){
            System.out.print(a[j]+" ");
        }
    }
}
