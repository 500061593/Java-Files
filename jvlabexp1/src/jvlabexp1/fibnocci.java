package jvlabexp1;
import java.util.*;
public class fibnocci {

	public static void main(String[] args) {
		int n,a1=0,a2=1,a3=0;
		Scanner s = new Scanner(System.in);
        System.out.print("enter number of terms");
		n=s.nextInt();
		for(int i=1;i<=n;++i) {
			if(i==1) {
				System.out.print(i);
			}
			if(i==2) {
				System.out.print(" "+i);
			}
			a3=a1+a2;
			a1=a2;
			a2=a3;
			System.out.print(" "+a3);
		}
        
	}

}
