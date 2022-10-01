import java.util.Scanner;

class people{
	private String name;
	private String add;
	private int age;
	


	void nhap() {
		Scanner sc= new Scanner(System.in);
		System.out.println("nhap ten: ");
		this.name= sc.nextLine();
		System.out.println("nhap que quan: ");
		this.add= sc.nextLine();
		System.out.println("nhap tuoi: ");
		this.age=Integer.parseInt(sc.nextLine());
		
	}
	void in() {
		System.out.println("thong tin: ");
		System.out.print(this.name+" "+this.age+" "+this.add);
	}
}
public class nhanvien extends people {
	float bacluong;
	void nhap() {
		super.nhap();
		System.out.println("nhap vao bac luong: ");
		Scanner sc= new Scanner(System.in);
		this.bacluong= Float.parseFloat(sc.nextLine());
	}
	void in() {
		super.in();
		System.out.println(" "+this.bacluong);
	}
	public static void main(String[] args) {
		nhanvien a= new nhanvien();
		a.nhap();
		a.in();
	}
}
