import java.util.Scanner;

 class ptb1 {
	private double a;
	private double b;
	
public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
void nhap() {
	Scanner sc= new Scanner(System.in);
	System.out.println("nhap vao he so bac 1: ");
	this.a= sc.nextDouble();
	System.out.println("nhap vao he so bac 0: ");
	this.b= sc.nextDouble();
}
void giai() {
	if(this.a==0 ) {
		if(this.b==0) {
			System.out.println("pt vo so nghiem ");
		}else {
			System.out.println("pt vo nghiem ");
		}
	}else {
		System.out.println("pt co nghiem la: "+(-b/a));
	}
}
 }
public class Ptb2 extends ptb1{
double c;
Scanner sc= new Scanner(System.in);
void nhap() {
	System.out.println("nhap vao he so bac 2: ");
	this.c=sc.nextDouble();
	super.nhap();
}
void giai() {
	if(c==0) {
		System.out.println("phuong trinh: "+super.getA() + "x+ "+super.getB()+"=0");
		System.out.println("day la phuong trinh bac 1 ");
		super.giai();
	}else {
		System.out.println("phuong trinh: "+c+"x^2+"+super.getA() + "x+ "+super.getB()+"=0");
		double d;
		d = (super.getA() * super.getA()) - (4 * c * super.getB());
		if (d < 0) {
			System.out.println("phuong trinh vo nghiem");
		} else {
			if (d == 0) {
				double nghiem = - (super.getA())/ (2 * c);
				System.out.println("phuong trinh co 2 nghiem kep: " + nghiem);

			} else {
				double nghiem1 = (-(super.getA()) + Math.sqrt(d)) / (2 * c);
				double nghiem2 = (-(super.getA()) - Math.sqrt(d)) / (2 * c);
				System.out.println("phuong trinh co nghiem la: " + nghiem1 + "\n");
				System.out.println("phuong trinh co nghiem la: " + nghiem2 + "\n");
			}
			
		}
	}
}
public static void main(String[] args) {
	Ptb2 t=new Ptb2();
	t.nhap();
	t.giai();
}
}
