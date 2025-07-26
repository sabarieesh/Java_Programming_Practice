class rotation {
    public boolean rotateString(String s, String goal) {
        {

            boolean b=false;
            if(goal.length()<=1)
                return b;
            String s1=s+s;
            if(s1.contains(goal)){
                return true;
            }

            return b;
        }

    }}