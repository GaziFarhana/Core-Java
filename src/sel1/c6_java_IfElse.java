package sel1;

public class c6_java_IfElse {

	public static void main(String[] args) {
		
int i=100;
int j=101;
int h=50;


//if(i<j) {	
//	System.out.println("this is true");
//}
//else	{
//	System.out.println("this is false");
//}

//If/Else statement using logical operators
 if (i<j && h<j)   {    

System.out.println("this is true");
 }
 else if(i>j ||j>i) {
System.out.println("one condition is true");
 }
 else {
System.out.println("this is false");
 }


//even and odd
if(j%2!=0) {
	System.out.println("this is a even number");
}

else {
System.out.println("this is a odd number");
}
//If/ELse using the String	
	
	String s="peoplentech";
			if(s.length()>5) {
	System.out.println("this string contains more than 5 characters");
			}
			else {
				System.out.println("this string is less than 5 charater");
			}
	
	
	
	
	
	}
}
