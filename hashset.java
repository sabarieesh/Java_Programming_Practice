import javax.swing.*;
import java.util.*;
public class hashset {
    public static void main(String[] args) {
        int arr[]={-1,-10,6,7,-7,1};
        int start=0;
        int end=arr.length-1;

        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
//
        int n=arr.length-1;
        System.out.println();
        for(int i=0;i<arr.length;i++){
            if(arr[n]==-(arr[i])){
                System.out.print(-(arr[i]));
                break;
            }

        }
        n--;
    }
}
