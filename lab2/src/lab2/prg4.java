package lab2;

public class prg4 {
	int a ;
	prg4(int l)
	{
		a=l;
		
	}
	void pr()
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		prg4 ob1=new prg4(1);
		prg4 ob2=new prg4(10);
		prg4 ob3=new prg4(100);
		prg4 ob4=new prg4(15);
		prg4 ob5=new prg4(11);
		ob1.pr();
		ob2.pr();
		ob3.pr();
		ob4.pr();
		ob5.pr();
		
	}

}
