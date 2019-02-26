package jvlabexp1;
import java.util.*;
public class calculator {

	public static void main(String[] args) {
		int a,b,n;
		Scanner s = new Scanner(System.in);
		System.out.print("enter first terms");
		a=s.nextInt();
		System.out.print("enter second terms");
		b=s.nextInt();
		System.out.print("1:add,2:subtract,3:multiply,:4:divide");
		System.out.print("enter your choice");
		n=s.nextInt();
		switch(n) {
		case 1:System.out.print("sum is:"+(a+b));
		break;
		case 2:System.out.print("difference is:"+(a-b));
		break;
		case 3:System.out.print("multiplication is:"+(a*b));
		break;
		case 4:System.out.print("division is:"+(a/b));
		break;
		default:System.out.print("wrong choice");
		}

	}

}
