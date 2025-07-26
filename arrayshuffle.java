import java.util.*;
public class arrayshuffle {
    public static void main(String[] args) {


        int[] arr1={1,2,3};
        int[] arr2={4,5,6};
//        ArrayList<Integer> ans=new ArrayList<>();
        int k=0;
        int j=arr2.length-1;
        int ans[]=new int[arr1.length+arr2.length];
        for(int i=0;i<ans.length;i++){
            if(i%2==0){
            ans[i]=arr1[k++];
            }
            else{
                ans[i]=arr2[j--];
                }
            }
        System.out.print(Arrays.toString(ans));
        }



    }

