import java.util.*;

public class subarr {
    public static void main(String[] args) {
        int arr[]={1,2,7,-4,2,2,-1,3,4};
        for(int i=0;i<arr.length;i++) {
            int sum = 0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum==3){
                    int [] sub=Arrays.copyOfRange(arr,i,j+1);
                    System.out.println(Arrays.toString(sub));

                }
            }

        }
    }
}
