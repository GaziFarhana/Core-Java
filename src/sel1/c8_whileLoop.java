package sel1;

public class c8_whileLoop {

	public static void main(String[] args) {

		// print the numbers from 5 to 10
		int i=10;
		while(i>=5){
		System.out.print(i+",");
		i--;
		}
System.out.println();
//		// print the numbers between 20 to 50
		int k=20;
		while(k<=50) {
	System.out.print(k+",");
		k++;
		}
		
		System.out.println();
		// using while loop in array
		int arr[]= {2,23,67,2,45,4};
		int d=0;
		while(d<4) {
		System.out.print(arr[d]+",");
d++;

		}
	}
}
