
public class Search {

	int BinarySearch(int array[],int s, int low, int high) {
	
		int mid = (low+high-1)/2;
		if(s==array[mid]) {
			return s;
		}
		else if(s<array[mid]) {
			return BinarySearch(array, s, low, mid-1);
		}
		else if(s>array[mid]) {
			return BinarySearch(array, s, mid+1, high);
		}
		return -1;
		
		
		
	}
	
	public static void main(String[] args) {
		Search ob = new Search();
        int arr[] = {2,3,4,5,6,10,40,12,13,14,15};
        int n = arr.length;
        int s = 12;
        int result = ob.BinarySearch(arr,s,0,n-1);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "+result);
    }
	}


