public class Main {

    public static void main(String[] args) {
	// write your code here
        int n1=0,n2=1,n3,count=10;

        for(int i=2;i<count;++i)
        {
            n3=n1+n2;
            System.out.println(n1+" + "+n2+" = "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
