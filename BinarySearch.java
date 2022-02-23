package Search;

public class BinarySearch {
	
	public int binarysearch(int[] arr,int key) {
		int low = 0;
		int high = arr.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid] == key)return mid;
			if(key < arr[mid]) {
				high = mid-1;
				
			}
			else {
				low = mid+1;
			}
			
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch bs = new BinarySearch();
		int[] arr = {10,22,26,46,37,39,45};
		System.out.print(bs.binarysearch(arr, 25));
	}

}
