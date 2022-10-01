import java.util.Scanner;

public class ptb1 {
	private double a;
	private double b;
void nhap() {
	Scanner sc= new Scanner(System.in);
	System.out.println("nhap vao he so a: ");
	this.a= sc.nextDouble();
	System.out.println("nhap vao he so b: ");
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
public static void main(String[] args) {
	ptb1 t= new ptb1();
	t.nhap();
	t.giai();
}
}
