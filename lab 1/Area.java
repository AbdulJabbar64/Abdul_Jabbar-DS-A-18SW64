import java.util.*;
class Area {
	int length;
	int breadth;
	public void setDim(int l,int b) {
		length=l;
		breadth=b;
	}
	public int getArea() {
		return (length*breadth);
	}

	public static void main(String[] args) {
		Area area=new Area();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Length  ");
		int le=sc.nextInt();
		System.out.println("Enter the Breadth  ");
		int br=sc.nextInt();
		area.setDim(le,br);
		System.out.println("Area of Rectangle  "+area.getArea());
	}
}