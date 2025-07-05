package java_fundamentals;
import java.util.*;
public class Question4b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int rem1= n1%10;
		int rem2=n2%10;
		if( rem1 == rem2) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}

	}

}