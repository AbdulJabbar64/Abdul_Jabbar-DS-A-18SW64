class Sort2D {
	public static void main(String[] args) {
		int array[][] = { { 9, 8, 7, 1 },{ 7, 3, 0, 2 },{ 9, 5, 3, 2 },{ 6, 3, 1, 2 } };
		//to sort 2D array
        for (int i=0;i<array.length;i++) {
            for (int j=0;j<array[i].length;j++) {
                for (int k=0;k<array[i].length-j-1;k++) { 
                    if (array[i][k]>array[i][k+1]) {
                        int temp=array[i][k]; 
                        array[i][k]=array[i][k+1];
                        array[i][k+1]=temp;
                    }
                }
            }
        }
        //print the 2D array
        for (int i=0;i<array.length;i++) { 
            for (int j=0;j<array[i].length;j++)
                System.out.print(array[i][j]+" "); 
            System.out.println(); 
        } 
    }
}