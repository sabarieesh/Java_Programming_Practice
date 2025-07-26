import java.util.*;
public class otp {
    public static void main(String[] args) {
////        String username="sabarieesh@gmail.com";
//        ArrayList<Integer> ans=new ArrayList<>();
//Scanner scan=new Scanner(System.in);
//while(true){
//    int n=scan.nextInt();
//    if(n==-1){
//        System.out.println("completed");
//        break;
//    }
//    ans.add(n);
//}
//
//        int sum=0;
//for(int a:ans){
//    sum=sum+a;
//}
//int avg=sum/ans.size();
////     System.out.println(avg);


        String[] items={"milk","bread","butter","chips","toilet paper"};
        String[] bought={"milk","bread"};
        ArrayList<String> ans1=new ArrayList<>(Arrays.asList("milk","bread","butter","chips","toilet paper"));
        ArrayList<String> ans2=new ArrayList<>(Arrays.asList("milk","bread"));
//        for( String s:items){
//            ans1.add(s);
//        }
//        for( String s2:bought){
//            ans2.add(s2);
//        }

        for(String s1:ans1){
           if(!ans2.contains(s1));
           System.out.print(s1+" ");
        }
    }
}
