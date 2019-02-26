package jvlabexp1;
class SCS{
	int faculty_id=1234567;
	String faculty_name="abc";
	String dept="cybernatics";
	void display() {
		System.out.println("faculty_id:"+faculty_id);
		System.out.println("faculty_name:"+faculty_name);
		System.out.println("dept:"+dept);
		}
	
}
class systematics extends SCS{
	void teachjava() {
		System.out.println(faculty_id+"is teaching java in systematics");
		}
}
class cybernatics extends systematics{
	void display() {
		System.out.println("no teacher appointed yet");
	}
}
public class main2 {

	public static void main(String[] args) {
	
		cybernatics ob = new cybernatics();
		ob.display();
		ob.teachjava();
		ob.display();
		
	}

}
