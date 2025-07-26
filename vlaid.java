import java.sql.SQLOutput;
import java.util.*;
public class vlaid {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        char c;
       int valid=0;
       int  invalid=0;

        for(int i=1;i<=n;i++){
            String s=scan.nextLine();
            for(int j=0;j<s.length();j++){
                c=s.charAt(j);
                if(!Character.isLetter(c)){
                    invalid++;
                    break;
                }
                else if(j==s.length()-1)
                    valid++;
            }
        }
        System.out.println(valid);
        System.out.println(invalid);
    }
}
