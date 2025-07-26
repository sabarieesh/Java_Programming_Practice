import java.util.*;

public class marbles {
    public static void main(String[] args) {
        int arr[]={10,4,3,17,11};
        int arr1[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(i%2==0)
                arr1[i]=arr[i]/2;
            else
                arr1[i]=arr[i];
        }
        System.out.println(Arrays.toString(arr1));
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>=5)
                System.out.println("Player "+(i+1)+" survive");
            else
                System.out.println("Player "+(i+1)+" die");
        }

    }
}
