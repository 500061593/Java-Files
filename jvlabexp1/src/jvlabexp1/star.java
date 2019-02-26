package jvlabexp1;

public class star {

	public static void main(String[] args) {
		int n=9;
		int k;
		k=n;
		for(int i=n;i>0;i--) {
			while(k>n/2) {
				System.out.print(" ");
				k--;
			}
			System.out.print("*");
		}
		System.out.println(" ");
	}
}


