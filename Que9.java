import java.util.*;
public class Que9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max=Integer.MIN_VALUE;
		int secondmax=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secondmax=max;
				max=arr[i];
			}else if(arr[i]>secondmax && arr[i]!=max){
				secondmax=arr[i];
			}
		}
		if(secondmax==Integer.MIN_VALUE) {
			System.out.println("-1");
		}else {
			System.out.println(secondmax);
		}
		sc.close();
	}

}
