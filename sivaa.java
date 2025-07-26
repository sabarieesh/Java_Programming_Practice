public class sivaa {
    public static void main(String[] args) {
        String s="Hi hello world";
        int n=s.length();
        String s1="";
        int j=n-1;
        for(int i=0;i<n;i++){

            if (s.charAt(i)==' '){
                s1+=' ';
                
            }
            else{
                if(s.charAt(j)!=' '){
                    s1+=s.charAt(j);
                }
            }
            j--;
        }
        System.out.println(s1);
    }
}
