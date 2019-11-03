class  FloatAverage {
	public static float print(float[]a) {
    	float avg=0.0f;
    	for (int i=0;i<a.length;i++) {
    		avg=avg+a[i];
    	}
    	System.out.println("total  "+avg);
    	return (avg/a.length);
    }
    public static void main(String[] args) {
    	float[] z={2.3f,4.6f,1.6f,8.7f,6.5f};
        System.out.println("avg   "+print(z));
    }
}