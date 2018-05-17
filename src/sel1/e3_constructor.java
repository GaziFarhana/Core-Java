package sel1;

public class e3_constructor {

	e3_constructor(){
		System.out.println("this is the contructor");
	}
	public static void main(String[] args) {
		
		e3_constructor b1=new e3_constructor();
			b1.adding(4, 6);
		
            b1.multi(2, 4);
	
	}

	
	public void adding(int a, int b) {
	int c=a+b;
	System.out.println(c);
}
	
	
	public void multi(int a, int b) {
	int c=a*b;
	System.out.println(c);
}
	
}
