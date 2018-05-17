package sel1;

public class d1_array {

	public static void main(String[] args) {
		
int arr[]= {2,4,1,5,6,24,4,-34,21,45,-66,99,100};
String str[]= {"welcome","to","java"};
	
//System.out.println(arr[5]);	
//
//for(int i=0;i<arr.length;i++) {
//	System.out.print(arr[i]);
//	}
//
//System.out.println();


//lets find out the negative number number from the array
	
//for(int j=0;j<arr.length;j++) {
//if(arr[j]<0) {
//System.out.println(arr[j]+" are negative numbers");
//}
//}

//lets find out the positive numbers from the array
//for(int j=0;j<arr.length;j++) {
//if(arr[j]>0) {
//System.out.println(arr[j]+" are positives numbers");
//}
//}


//lets find out the maximum number from the array
int max=arr[0];
for(int l=0;l<arr.length;l++) {
if(max<arr[l]) {
max=arr[l];
}
}
System.out.println("maximum numbers from that array is "+max);
//find out the minimum number from the array
int min=arr[0];
for(int m=0;m<arr.length;m++) {
if(min>arr[m]) {
min=arr[m];
}
}
System.out.println("minimum numbers are "+min );


//find out duplicates from the array	
	
	for (int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
	if(arr[i]==arr[j] && (i!=j)) {
	System.out.println(arr[i]+ " duplicate number");
	}
	}
	}
	
	}

}
