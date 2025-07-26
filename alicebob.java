import java.util.*;
public class alicebob {
    public static void main(String[] args) {
        String[] arr={"Alice","alice","ALICE","bob","Bob@","Charlie","charlie","charlie@"};
        HashSet<String> set=new HashSet<>();
//        for(int i=0;i<arr.length;i++){
//            set.add(arr[i].toLowerCase());
//        }
        int dup=0;
        for(String s:arr){
           String ans=s.toLowerCase().replaceAll("[^a-z]"," ").trim();
           if(!set.add(ans)){
               dup++;}
           else{
           set.add(ans);
        }}
        System.out.println(set);
        System.out.println(dup);
    }
}
