package Search;
public class LinerSearch {
	
	
	public int search(int[] arr,int n,int x) {
		for(int i =0 ;i<n;i++) {
			if(arr[i] == x) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,3,5,7,6,4,39};
		LinerSearch ls =new LinerSearch();
		System.out.println(ls.search(arr, arr.length, 39));
	}
	
}
