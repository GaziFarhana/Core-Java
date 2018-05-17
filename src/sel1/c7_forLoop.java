package sel1;

public class c7_forLoop {

	public static void main(String[] args) {

		// print the value of i from 1 to 10
		for (int i = 1; i <= 10; i++) {
			System.out.println("the valure of i is " + i);
		}

		// print the triangle * following way
		// *
		// **
		// ***
		// ****
		// *****
		for(int j=0;j<=5;j++) {
		for(int k=0;k<j;k++) {
System.out.print("*");
		}
System.out.println();

		}

		// find out the sum of 1 to 50
		int sum=1;
		for(int l=1;l<=50;l++) {
		sum=sum+l;
		}
		System.out.println("sum of 1 to 50 is "+sum);
		
		// reverse a String
		String s="America";
		for(int i=s.length()-1;i>=0;i--) {
		System.out.print(s.charAt(i));
		}
System.out.println();
		// find even numbers from 1 to 100
		
		int sum1=0;
		for(int k=1;k<=100;k++) {
		if(k%2==0) {
		System.out.println("even number "+k);
		sum1=sum1+k;
		}
		}	
				
				
				
		// find out odd numbers from 1 to 100
		
		int sum2=0;
		for(int k=0;k<=100;k++) {
		if(k%2!=0) {
		System.out.println("odd number "+k);
		sum2=sum2+k;
		}
		}	
				
		

//		print all the numbers that can be divided by 3 and 5
		int sum3=0;
		for(int f=0;f<=100;f++) {
		if(f%3==0 && f%5==0)
		System.out.print(f+",");
		}
		
		
		
		
	}

}
