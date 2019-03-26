public class Matches {

	public static int Count (String str, String sub) {
		int count = 0;
		int index = 0;
		while ((index = str.indexOf(sub, index)) != -1) {
			count++;
			index += sub.length();
	   }
	    return count;
	}
}
