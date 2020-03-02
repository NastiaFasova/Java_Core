package Shapes;
import java.util.Scanner;
public class Rectangle {
	private int length;
	private int width;
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	public Rectangle() {
		this.length = 50;
		this.width = 25;
	}

	public int area() {
		return length*width;
	}
	public int perimeter() {
		return 2*(length*width);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("������ ������� ������� ������������: ");
		int l=scan.nextInt();
		System.out.println("������ ������ ������� ������������: ");
		int w =scan.nextInt();
		Rectangle obj1 = new Rectangle();
		Rectangle obj2 = new Rectangle(l,w);
		System.out.println("����� ������� ������������ = "+ obj1.area());
		System.out.println("�������� ������� ������������ = "+obj1.perimeter());
		System.out.println("����� ������� ������������ = "+ obj2.area());
		System.out.println("�������� ������� ������������ = "+obj2.perimeter());
		scan.close();
	}
}

