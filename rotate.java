import java.util.*;
public class rotate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=2;
        k=k/2;
        int ind=0;
        int ans[]=new int[arr.length];
        for(int i=k;i<arr.length;i++){
            ans[ind++]=arr[i];
        }
        for(int i=0;i<k;i++){
            ans[ind++]=arr[i];
        }
        System.out.print(Arrays.toString(ans));
    }
}
