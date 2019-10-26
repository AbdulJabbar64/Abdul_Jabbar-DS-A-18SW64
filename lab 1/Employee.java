import java.util.*;
class Employee {
	int salary;
	int hours;
	public void getInfo(int s,int h) {
		salary=s;
		hours=h;
		if (salary<500) {
			addSal();
		}
		if (hours>6) {
			addWork();
		}
		System.out.println("salary  "+salary);
		System.out.println("hours  "+hours);
	}
	public void addSal() {
		salary=salary+10;
	}
	public void addWork() {
		salary=salary+5;
	}

	public static void main(String[] args) {
		Employee e=new Employee();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter salary ");
		int sa=sc.nextInt();
		System.out.println("Enter No: of Working hours ");
		int ho=sc.nextInt();
		e.getInfo(sa,ho);
	}
}