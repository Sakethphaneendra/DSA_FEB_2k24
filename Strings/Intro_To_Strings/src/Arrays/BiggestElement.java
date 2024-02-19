package Arrays;

public class BiggestElement {

	public static void main(String[] args) {
		
//		Array Input -> Array Search (Linear Search) -> Output
		
		int arr[]= new int[] {1,2,3,42,-6,02,12,81,9,31,89,123};
		int biggest=arr[0];
		int small = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>biggest) {
				biggest = arr[i];
			}
			if(arr[i]<small) {
				small = arr[i];
			}
		}
		System.out.print(biggest + " " +small);

	}

}
