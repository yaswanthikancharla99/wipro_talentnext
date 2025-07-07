package arrays;
import java.util.*;
public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);  
 	   int [][]arr=new int[3][3];
 	   System.out.println("enter the elements");
 	   for(int i=0;i<3;i++) {
 		   for(int j=0;j<3;j++) {
 			  
 			   arr[i][j]=sc.nextInt();
 		   }
 	   }
 	   int max=arr[0][0];
 	   for(int i=0;i<3;i++) {
 		   for(int j=0;j<3;j++) {
 			   if(arr[i][j]>max) {
 				   max=arr[i][j];
 			   }
 		   }
 	   }
 	   System.out.println(max);
	 }


	}

