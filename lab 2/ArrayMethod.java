import java.util.Arrays;
class ArrayMethod{
public static void printArray(String arg[]) {
    for(int i=0;i<arg.length;i++){
        System.out.println(arg[i]);
    }
}
	public static void main(String arg[]){
		String[] arr={"one","two","three","four","five"};
    	String[] unsort ={"one","four","three","two","five"};
		String[] arr2={"one","two","three","four","five"};  
    	String[] dest=new String[10];
		//sort array
		Arrays.sort(arr);
		//print length
		System.out.print("Length of an array");
		System.out.println(arr.length);
		System.out.println("Binary Search of number 3");
		//apply binary search and print results
		System.out.println(Arrays.binarySearch(arr, "three"));
		//create a copy of array truncated or padded with zero based on size 
		//of new array
    	String[] arrCopy=Arrays.copyOf(arr,10);
    	System.out.println("copy of array printed");
    	printArray(arrCopy);
    	//copy of range
    	System.out.println("Copy Into Range");
    	String[] copyIntoRange=Arrays.copyOfRange(arr,0,10);
    	//printing array
   		printArray(copyIntoRange);
    	//equals method
    	System.out.println("Equals Method in arrays");
    	System.out.println(Arrays.equals(arr,arr2));
    	//fill method
    	Arrays.fill(arr2,"two");
    	//printing filled array
    	System.out.println("filled array with 2");
		printArray(arr2);
		//filling in specific range
		Arrays.fill(arr2,2,4,"zero");
		//print array
		System.out.println("filling in specific range");
		printArray(arr2);	
		//sorting in specific range
		Arrays.sort(unsort,2,5);
		//print sorted array from 2 to 4 index
		System.out.println("Print Sorted Array");
    	//print sorted array
		printArray(unsort);
		//print array converted to string
		System.out.println(Arrays.toString(unsort));
	}
}