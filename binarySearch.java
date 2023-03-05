/*
Time Complexity Best Case ==  O(1)
Time Complexity Worst Case ==  O(logn/log2)
*/

package dsaCode;
import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++){
            System.out.print("Enter value for a["+i+"]: ");
            a[i]=sc.nextInt();
        }
        int start = 0;
        int end = n-1;
        int mid;
        System.out.print("Enter Which Item You Want to Search: ");
        int item = sc.nextInt();
        while(start <= end){
            mid = (start + end)/2;
            if (a[mid] == item){
                System.out.println("Item "+item+" is present in array at index "+mid);
                break;
            }
            if (item > a[mid]){
                start = mid + 1;
            }
            if (item < a[mid]){
                end = mid - 1;
            }
        }
    }
}
