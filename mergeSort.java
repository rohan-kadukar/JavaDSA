/*
Time Complexity Best Case ==  O(nlogn)
Time Complexity Worst Case ==  O(nlogn)
*/

package dsaCode;
import java.util.*;
class sort{
    void mergeS(int[] a,int start,int end){
        int mid;
        if (start < end){
            mid = (start + end)/2;
            mergeS(a,start,mid);
            mergeS(a,mid+1,end);
            merge(a,start,mid,end);
        }
    }
    void merge(int[] a,int start,int mid,int end){
        int l = mid - start + 1;
        int r = end - mid;
        int[] left_subArray = new int[l];
        int[] right_subArray = new int[r];
        for (int i=0;i<l;++i){
            left_subArray[i] = a[start+i];
        }
        for (int j=0;j<r;++j){
            right_subArray[j] = a[mid+1+j];
        }
        int i=0;
        int j=0;
        int k=start;
        while (i<l && j<r){
            if (left_subArray[i] <= right_subArray[j]){
                a[k] = left_subArray[i];
                i++;
            }else {
                a[k] = right_subArray[j];
                j++;
            }
            k++;
        }
        while(i<l){
            a[k] = left_subArray[i];
            i++;
            k++;
        }
        while (j<r){
            a[k] = right_subArray[j];
            j++;
            k++;
        }
    }
}
public class mergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++){
            System.out.print("Enter value for a["+i+"]: ");
            a[i]=sc.nextInt();
        }

        sort s = new sort();
        s.mergeS(a,0,n-1);

        System.out.print("Array is: ");
        for(int j=0;j<n;j++){
            System.out.print(a[j]+" ");
        }
    }
}
