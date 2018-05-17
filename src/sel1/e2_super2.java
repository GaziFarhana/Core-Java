package sel1;

public class e2_super2 extends e1_super1{

	String a=("today is a rainy day");
	
	public static void main(String[] args) {
	

		e2_super2 b1=new e2_super2();
		b1.str(" weather forecast :");

	
	
	}	

	
	public void str(String s) {
		System.out.println(s+a);
		System.out.println(super.a);
	System.out.println(s+super.a+ " and also "+this.a);
	
	
	}	
	
}
