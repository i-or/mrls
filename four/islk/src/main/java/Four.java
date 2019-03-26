import java.lang.Integer;
import java.util.Scanner;
public class Four {
	public static void main(String[] args) {
	  if (args.length < 4) {
      if (args.length < 3) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int min2 = findMin2(a, b);
        System.out.println(min2);
      } else {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int min3 = findMin3(a, b, c);
        System.out.println(min3);
      }
    } else {
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      int c = Integer.parseInt(args[2]);
      int d = Integer.parseInt(args[3]);
      int min4 = findMin4(a, b, c, d);
      System.out.println(min4);
    }
			}

	}
	public static int findMin2 (int a, int b) {
	 	   int low2;
	 	    low2 = Math.min(a, b);
	 	    return low2;
	}
	public static int findMin3 (int a, int b, int c) {
	 	   int low3;
	 	   a = findMin2(a,b);
	 	   low3 = Math.min(a, b);
	 	    return low3;
	}
	public static int findMin4 (int a, int b, int c, int d) {
	 	   int low4;
	 	  a = findMin3(a,b,c);
	 	    low4 = Math.min(a, b);
	 	    return low4;
	}
	


}
