import java.util.*;
public class pattern {
    public static void main(String[] args) {
        int a=5;
        for(int i=0;i<a;i++,System.out.println()){
            for(int j=0;j<a;j++){
               if((i==j)||(i+j==a-1)){
                   System.out.print("*");
               }
               else
                   System.out.print(" ");
            }

        }
    }
}
