import java.util.*;
public class pratice01 {
    public static void main(String[] args) {
        int arr[]={3,4,7,8,23,4,93,18};
//        boolean b=true;
        for(int i=1;i<arr.length;i++){
            if(!(arr[i]%2==0&&arr[i-1]%2!=0||arr[i]%2!=0&&arr[i-1]%2==0)){
                System.out.println("no");
            return;}
        }
        System.out.println("yes");
    }
}
