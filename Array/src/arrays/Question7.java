package arrays;
import java.util.*;
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Ascii values");
		int n= sc.nextInt();
		int[] asciiValues = new int[n];
		for(int i=0;i<n;i++) {
			asciiValues[i]=sc.nextInt();
		}
		for(int value:asciiValues) {
			System.out.print((char)value);
		}

	}

}
