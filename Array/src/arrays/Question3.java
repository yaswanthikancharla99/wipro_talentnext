package arrays;
import java.util.*;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int target = sc.nextInt();
		boolean found = false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				System.out.println(i);
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("-1");
		}
		
	}

	}


