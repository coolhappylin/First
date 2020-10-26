public class hello {
    public static void main(String[] args) {
        int x=121;
        String m=""+x;

        boolean z=true;
      for(int i=0,j=m.length()-1;i<m.length();i++,j--)

                if(m.charAt(i)!=m.charAt(j)){

                    z=false;
                    break;
                }


       System.out.println(z);
    }
}
