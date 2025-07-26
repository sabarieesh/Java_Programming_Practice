import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
//int a[]=new int[7];
//for(int i=0;i<7;i++){
//    a[i]=scan.nextInt();
//
//int arr[]={6,-10,-3,5,9,2,-4};
//int start=0;
//int end=arr.length-1;
//
////int target=0;
//
////Arrays.sort(arr);
//while(start<end){
//  int ans=Math.abs(arr[start]+arr[end]);
//  int mindiff=Integer.MAX_VALUE;
//  int num1=0;
//  int num2=0;
//    if(ans<Math.abs(mindiff)){
//        mindiff=ans;
//    num1=arr[start];
//    num2=arr[end];}
//    if(ans<0){
//        start++;}
//        else{
//            end--;
//        }
//    System.out.println(ans);
//    }





        /// ////////////////////////////////////////////////////////////////




        int a=scan.nextInt();
        int sum=0;
        String s=String.valueOf(a);
        char arr[]=s.toCharArray();
        for(int i=2;i<arr.length;i++){
            if(i%i==0&&i%1==0){
                sum=sum+arr[i];
            }
        }
        System.out.println(sum);

}


}