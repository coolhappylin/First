public class huiwenshu {
    public static void main(String[] args) {

        int x=123212,reverse=0;

        if(x<0||(x%10==0&&x!=0))
            System.out.println(false);
        while (x>reverse){
            reverse=reverse*10+x%10;
            x=x/10;
        }

        System.out.println(reverse==x||x==reverse/10);
    }
}
