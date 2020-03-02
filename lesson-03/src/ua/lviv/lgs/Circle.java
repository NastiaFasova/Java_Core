package ua.lviv.lgs;
import java.util.Scanner;

public class Circle {
	private double radius;
	private double diametr;
	private static final double Pi=3.1415;
	public Circle(double radius, double diametr) {
		this.radius=radius;
		this.diametr=diametr;
	}
	public void area_display() {
		System.out.println("����� ���� = "+ Pi*(Math.pow(diametr/2, 2)));
	}
	public void length_display() {
		System.out.println("������� ���� = "+ 2*Pi*radius);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ ����� ����: ");
		double r = scan.nextDouble();
		System.out.println("������ ������ ����: ");
		double d = scan.nextDouble();
		Circle obj = new Circle(r,d);
		obj.area_display();
		obj.length_display();
	}
}
