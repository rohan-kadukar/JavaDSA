/*
Time Complexity Best Case ==  O(1)
Time Complexity Worst Case ==  O(n)
*/

package dsaCode;
import java.util.*;
public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++){
            System.out.print("Enter value for a["+i+"]: ");
            a[i]=sc.nextInt();
        }
        System.out.print("Enter item you want to search: ");
        int item = sc.nextInt();
        for(int j=0;j<n;j++){
            if (a[j] == item){
                System.out.println("Item "+item+" is present in array at index "+j);
            }
        }
    }
}