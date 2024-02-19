package Arrays;

public class Duplicate {

	public static void main(String[] args) {
		
//		Array Input -> Ascending Order -> Find Duplicate 
		
		int arr[]= new int[] {1,2,3,42,-6,2,12,81,1,123,42,9,31,89,123};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			try{
				
			
			if(arr[i]==arr[i+1]) {
				System.out.println(arr[i]);
			}
			}catch(ArrayIndexOutOfBoundsException s) {
				System.out.print(" ");
			}
			
		}

	}

}
