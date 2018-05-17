package sel1;

public class d7_interface2 implements d6_interface1, d8_interface3{

	public static void main(String[] args) {
		
		d7_interface2 b1=new d7_interface2 ();
		b1.add(10, 5);
		b1.delete(10, 7);
		
		
		
		
	}

	@Override
	public void add(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}

	@Override
	public void delete(int a, int b) {
		int c=a-b;
		System.out.println(c);
		
	}

}
