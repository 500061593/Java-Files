package pk2;

public class cube {
	public int cubic(int n) {
		int c=0;
		c=n*n*n;
		return c;	
	}


public static void main(String args[])
{
	cube ob=new cube();
	System.out.println(ob.cubic(3));
}

}

