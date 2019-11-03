import java.util.*;
class EqualArray {
	public static void main(String[] args) {
        int[]a={1,2,3,4,5};
        int[]b={1,2,3,4,5};
        boolean z=Arrays.equals(a,b);
        if (z) {
        	System.out.println("equals");
        }
        else {
        	System.out.println("not equals");
        }
	}
}