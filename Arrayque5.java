import java.util.*;
public class Arrayque5 {
	//method
	public static void searchElement(int[] arr,int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				System.out.println("Found at index " + i);
				break;
			}
		}
	}
	//main method
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		searchElement(arr,target);
		sc.close();
	}

}
