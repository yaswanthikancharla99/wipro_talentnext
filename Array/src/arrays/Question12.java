package arrays;
import java.util.*;
public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int[] result = new int[n];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=10) {
				result[index++]=arr[i];
			}
		}
		System.out.println(Arrays.toString(result));

	}

}
