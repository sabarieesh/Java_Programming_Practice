import java.util.*;
public class smallestsum {
    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
        int arr[]={1,2,3,4};
        ArrayList<Integer>ans=new ArrayList<>();
        int sum=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;i++){
                sum=sum+arr[j];
                ans.add(sum);
            }
            System.out.println(ans.get(2));
        }

    }
}
