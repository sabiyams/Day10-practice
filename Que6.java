import java.util.*;
public class Que6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] word=str.split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=word.length-1;i>=0;i--) {
			sb.append(word[i]);
			if(i!=0) {
				sb.append(" ");
			}
		}
		System.out.println(sb);
		sc.close();
	}

}
