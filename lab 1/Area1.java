class Area1 {
	int length;
	int breadth;
	Area1(int l,int b) {
		length=l;
		breadth=b;
	}
	public int returnArea() {
		return (length*breadth);
	}

	public static void main(String[] args) {
		Area1 area=new Area1(3,4);
		System.out.println("Area of Rectangle  "+area.returnArea());
	}
}