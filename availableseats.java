import java.util.*;
public class availableseats {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int arr[]={1,0,1,0,1,0,0,0,1,1};
        int count=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                count++;
            else{
                max=Math.max(count,max);
                count=0;
            }
        }
//        max=Math.max(count,max);
        System.out.println(max);
    }
}
