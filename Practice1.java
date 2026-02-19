import java.util.*;
public class Practice1 {
	//method
	public static LinkedHashMap<Integer,Integer> frequencyCount(int[] arr){
		LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i],map.get(arr[i])+1);
			}else {
				map.put(arr[i],1);
			}
		}
		return map;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[6];
		for(int i=0;i<6;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(frequencyCount(arr));
		sc.close();
	}
}
