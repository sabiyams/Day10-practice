import java.util.*;
public class Stringque5 {
	public static int countword(String str) {
		int count=0;
		return count=str.split(" ").length;
	}
	//main method
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(countword(str));
		sc.close();
	}
}
