package pk2;

public class revnum {

	public int rev(int n) {
		int r;
		int m=0;
		while(n>0) {
			r=n%10;
			m=m*10+r;
			n=n/10;
		}
		return m;
	}
public static void main(String args[])
{
	revnum ob=new revnum();
	System.out.println(ob.rev(444));
}

}
