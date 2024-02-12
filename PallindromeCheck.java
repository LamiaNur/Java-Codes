import java.util.Scanner; 
public class Main
{
	public static void main(String[] args) {
	    Scanner reader = new Scanner(System.in);
	    String str = reader.nextLine();
	    String reverseStr = "";
	    for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr = reverseStr + str.charAt(i);
        }
        if (str.equals(reverseStr)) {
            System.out.println(str + " is pallindrome.");
        } else {
            System.out.println(str + " is not pallindrome.");
        }
	}
}