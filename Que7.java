import java.util.*;
public class Que7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int N=sc.nextInt();
		System.out.println("Even numbers from 1 to " + N + ":");
		for(int i=1;i<=N;i++) {
			if(i%2==0) {
				System.out.print(i+ " ");
			}
		}
		sc.close();
	}

}
