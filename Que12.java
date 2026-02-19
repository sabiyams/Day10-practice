import java.util.*;
public class Que12 {
	//method
	public static boolean checkAngram(int num1,int num2) {
		String str1=String.valueOf(num1);
		String str2=String.valueOf(num2);
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1,ch2)) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		boolean res=checkAngram(num1,num2);
		System.out.println(res);
		sc.close();
	}
}
