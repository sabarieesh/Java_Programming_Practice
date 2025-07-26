
import java.sql.SQLOutput;
import java.util.*;
public class ascii {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        char a=scan.next().charAt(0);
        char b=scan.next().charAt(0);
        int a1=(int)a;
        int a2=(int)b;
        int dif=a2-a1;
//        System.out.println(dif);
        int sum=b+dif;
        int ans;
        if(sum>122){
             ans=sum-26;
       System.out.println((char)ans);}
        else
            System.out.println((char)sum);
    }

}
