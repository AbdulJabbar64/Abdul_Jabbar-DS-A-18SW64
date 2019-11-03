class SecondLargest {
	public static int printArray(int[]arr) {
		int max=0;
		int sec=0,index=0;
		for (int i=0;i<arr.length;i++) 
		{
			if(max<arr[i])
				max=arr[i];
		}
		for (int j=0;j<arr.length;j++) 
		{
			if (sec<arr[j]&&arr[j]!=max){
				sec=arr[j];
				index=j+1;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		int []array={1,2,4,5,6,0,8,3};
		System.out.println("Index of Second Largest in Array   "+printArray(array));
	}
}