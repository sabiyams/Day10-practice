import java.util.*;
public class Que11 {
	//method
	public static String checkAngram(String str1,String str2) {
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1,ch2) && ch1.length==ch2.length) {
			return "YES";
			
		}else {
			return "NO";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		String res=checkAngram(str1,str2);
		System.out.println(res);
		sc.close();
	}
}
