import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class SecondBinary {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int ar[] = new int[n];
		for(int a=0; a<ar.length; a++) {
		      ar[a] = r.nextInt(10000);
		    }
		Arrays.sort(ar);
		  for (int i = 0; i < ar.length; i++) {
		      System.out.print(ar[i] + ", ");
		    }
		  System.out.println("\nEnter element to search");
			int z=sc.nextInt();
			sc.close();
			if(Arrays.binarySearch(ar, z) >=0 ){
	            System.out.println("true");
	        }
			else
			{
	            System.out.println("false");
	        }

			
	}
}
	

	 

