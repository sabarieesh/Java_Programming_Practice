import java.util.*;
public class sorting {
    public static void main(String[] args) {
        int [] arr={1,-4,2,3,-8,-2};
        int max=arr[0];
        int sort[];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;i++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
