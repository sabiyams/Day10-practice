import java.util.*;
public class Stringque6 {
	//method
	public static String convertUppercase(String str) {
		return str.toUpperCase();
	}
	//main method
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(convertUppercase(str));
		sc.close();
	}
}
