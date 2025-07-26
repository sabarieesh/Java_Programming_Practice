import java.util.*;
public class valuefound {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,7};
        int n=5;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=n){
                System.out.println(arr[i]);
            return;
            }
        }

    }
}
