package sortingAlgos;

public class sortingAlgorithm {

	public static void main(String[] args) {
		int [] myArray = selectionSort(new int[] {9,4,2,98,5,46});
		for(int i =0; i < myArray.length; i++) {
		System.out.println(myArray[i]);
		
		
		}

	}

	public static int [] selectionSort(int [] a) {
		for(int i =0; i < a.length; i++) {
						
			int min = i; // 0
			
			
			
			
			for (int j= i+1; j < a.length; j++) {
				
				if(a[j] < a[min]) {
					min = j;
					
				}
			}
			
			int temp = a[i];
			
			a[i] = a[min];
	
			
			
			a[min] = temp; 
		}
		
		return a;
		
	}
}
