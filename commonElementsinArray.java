package Arrays;
import java.util.*;
public class commonElementsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
try {
System.out.println("Length for first array");
int length = sc.nextInt();//This variable will define length for 1st array
int array[] = new int[length];
//This will take inputs values for 1st array
System.out.println("Values for first array");
for(int i = 0;i<array.length;i++) {
	array[i] = sc.nextInt();
}
System.out.println("Length for second array");//This variable will define length for 2nd array
int length_1 = sc.nextInt();
int array_1[] = new int[length_1];
//This Loop will take inputs values for 2nd array
System.out.println("Values for second array");
for(int i = 0;i<array.length;i++) {
	array_1[i] = sc.nextInt();
}
//This loops will if there is any common values is there or not
//if found yes then it will print all the common values of both the arrays
System.out.println("The following values are common in both arrays");

Arrays.sort(array);
Arrays.sort(array_1);
	for(int i = 0;i<array.length;i++) {
		for(int j = 0;j<array_1.length;j++) {
			if(array[i] == array_1[j]) {
				System.out.println( array[i]);
			}
			
		}
	}


	
	
	

}catch(Exception e) {
	System.out.println(e);

}
	}

}
