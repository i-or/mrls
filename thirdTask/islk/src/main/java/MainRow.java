import java.util.Scanner;

public class MainRow {

	public static void main(String[] args) {
		String blabla = "lkvjabldrabgoqerg8q48tbasoisdbsvp87wgepqubg;oiasdhgpqernvabsdifgbpiwefbsidfj";
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter a letter to search");
		String n=sc.nextLine();
		sc.close();
		int count = Matches.Count(blabla, n);
		System.out.println(count);
	}
	
}
