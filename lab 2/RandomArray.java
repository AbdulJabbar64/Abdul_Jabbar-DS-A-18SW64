import java.util.*;
class RandomArray {
	public static void main(String[] args) {
		int[]a=new int[100];
        int i=0;
        Random r=new Random();
        for(;i<a.length;i++) {
            a[i]=r.nextInt(400);//to asigen the array with random elements with range 400 hundred
        }
        System.out.println("random Array");
        for(int j:a) {
            System.out.print(j+"  ");//unsorted array 
        }
        System.out.println();
        System.out.println("sorted the ramdon array ");
        for(int j=0;j<a.length;j++) {
            for(int k=0;k<a.length;k++) {
                if(a[k]>a[j]) {
                    int temp=a[j];
                    a[j]=a[k];
                    a[k]=temp;
                }
            }
        }
        for(int l=0;l<a.length;l++) {
            System.out.print(a[l]+"  ");//print the sorted array
        }
	}
}