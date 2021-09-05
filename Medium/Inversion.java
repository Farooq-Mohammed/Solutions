<<<<<<< HEAD
class Inversion {
/*
	For every i<j, find pairs such that ar[i]>ar[j]
*/

	int merge(int[] ar, int low, int mid, int high){

		ArrayList<Integer> temp = new ArrayList<>();

		int left = low;
		int right = mid+1;

		int cnt = 0;

		while(left<=mid && right<=high){
			if(ar[left]<ar[right]) 	
				temp.add(arr[left++]);
			else 	{
				temp.add(arr[right++]);
				cnt += mid-left+1; //All elements towards left are smaller
		
			}
		}

		while(left<=mid){
			temp.add(arr[left++]);
		}

		while(right<=high){
			temp.add(arr[right++]);
		}

		for(int i=low;i<=high;i++){
			arr[i] = temp.get(i-low);
		}
		return cnt;
	}


	int InversionCount(int ar[], int low, int high){
		if(low>=high)	return 0;

		int mid = (low+high) >> 1;
		int left = InversionCount(arr,low,mid);
		int right = InversionCount(arr, mid+1, high);
		int cnt = merge(arr, left, mid, high);

		return cnt + left + right;
	}


	public static void main(String[] args){
	
		int n = 6;
		int arr[] = {12, 11, 13, 5, 6, 7};

		System.out.println(InversionCount(arr, 0, n-1));
	}
}
=======
class Inversion {
/*
	For every i<j, find pairs such that ar[i]>ar[j]
*/

	int merge(int[] ar, int low, int mid, int high){

		ArrayList<Integer> temp = new ArrayList<>();

		int left = low;
		int right = mid+1;

		int cnt = 0;

		while(left<=mid && right<=high){
			if(ar[left]<ar[right]) 	
				temp.add(arr[left++]);
			else 	{
				temp.add(arr[right++]);
				cnt += mid-left+1; //All elements towards left are smaller
		
			}
		}

		while(left<=mid){
			temp.add(arr[left++]);
		}

		while(right<=high){
			temp.add(arr[right++]);
		}

		for(int i=low;i<=high;i++){
			arr[i] = temp.get(i-low);
		}
		return cnt;
	}


	int InversionCount(int ar[], int low, int high){
		if(low>=high)	return 0;

		int mid = (low+high) >> 1;
		int left = InversionCount(arr,low,mid);
		int right = InversionCount(arr, mid+1, high);
		int cnt = merge(arr, left, mid, high);

		return cnt + left + right;
	}


	public static void main(String[] args){
	
		int n = 6;
		int arr[] = {12, 11, 13, 5, 6, 7};

		System.out.println(InversionCount(arr, 0, n-1));
	}
}
>>>>>>> e7abdb583911a5652b33ddcce2bb6b6b9fca8bc1
