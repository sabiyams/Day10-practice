import java.util.*;
public class Que10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		for(int i=0;i<str1.length();i++) {
			char ch1=str1.charAt(i);
		}
			if(str2.contains(str1)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		
	    sc.close();
	}
}
