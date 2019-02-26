package lab2;

abstract class bike{
	abstract void run();
}
class honda extends bike{
 void run() {
	 System.out.println("run run run");
	 }
 public static void main(String[] args) {
	 bike ob=new honda();
	 ob.run();
 }
 }



	
