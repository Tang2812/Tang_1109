
package dai_diem;


import java.util.Random;
import java.util.Scanner;

//nhập vào dãy điểm, 
//tìm hai điểm có khoảng cách lớn nhất
//tìm tam giác gồm ba điểm. có diện tích lớn nhất
//tìm đa giác chứa tất cả các điểm có diện tích nhỏ nhất(convex hull)
class diem
{
	private int x,y;
	diem(){
		Random rand=new Random();
		this.x=rand.nextInt(100);
		this.y=rand.nextInt(100);
	}
	public diem(int x, int y) {
		this.x = x;
		this.y = y;}
		double kc(diem b) {
			return Math.sqrt(Math.pow(this.y-b.y,2));
		}
		@Override
		public String toString() {
			return " (" + x + ", " +y + ")";
		}
		
}
public class Day_diem {
	diem [] a;
	void nhap()
	{
		System.out.println("nhap so diem: ");
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a= new diem[n];
		for(int i=0;i<n;i++) {
			a[i]=new diem();
		}
	}
	void in() {
		System.out.println("day gom co "+a.length+" diem");
	for(int i=0;i<a.length;i++)System.out.println(a[i]);
	}
	void capdiem() {
		double dmax=a[0].kc(a[1]);
		int v1=0;
		int v2=1;
		for(int i=0;i<a.length;i++)
			for(int j=i+1;j<a.length;j++) {
				if(a[i].kc(a[j])>dmax) {
					dmax=a[i].kc(a[j]);
					v1=i;
					v2=j;
				}
			}
		System.out.println("Hai diem co khoang cach lon nhat la: "+dmax);
		System.out.println("Hai diem do la: "+a[v1]+" va "+a[v2]);
	}
	double heron(double d1, double d2, double d3) {
		double p;
		p=(d1+d2+d3)/2;
		double t;
		t=p*(p-d1)*(p-d2)*(p-d3);
		double s= Math.sqrt(t);
		return s;
		
	}
	void tamgiac() {
		double smax=heron(a[0].kc(a[1]),a[0].kc(a[2]),a[1].kc(a[2]));
		int v1=0;
		int v2=1;
		int v3=2;
		for(int i=0;i<a.length-2;i++) {
			for(int j=i+1;j<a.length-1;j++) {
				for(int z=j+1;z<a.length;z++) {
					if(smax<heron(a[i].kc(a[j]),a[i].kc(a[j]),a[j].kc(a[z]))) {
						smax=heron(a[i].kc(a[j]),a[i].kc(a[j]),a[j].kc(a[z]));
						v1=i;
						v2=j;
						v3=z;
					}
				}
			}
		}
		System.out.println("Ba diem co dien tich lon nhat la: "+smax);
		System.out.println("ba diem do la: "+a[v1]+" va "+a[v2]+" va "+a[v3]);
	}
	public static void main(String[] args) {
		Day_diem m=new Day_diem();
		m.nhap();
		m.in();
		m.capdiem();
		m.tamgiac();
	}
}
