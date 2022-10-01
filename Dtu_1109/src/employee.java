import java.util.Scanner;

public class employee {
private String ten;
private float luong;
public employee() {

}
public String getTen() {
	return ten;
}
public void setTen_ban(String Ten) {
	this.ten = Ten;
}
public float getLuong() {
	return luong;
}
public void setLuong(float luong) {
	this.luong = luong;
}
 void input() {
	System.out.println("nhap vao ten: ");
	Scanner sc= new Scanner(System.in);
	this.ten= sc.nextLine();
	System.out.println("nhap he so luong: ");
	this.luong= Float.parseFloat(sc.nextLine());
}
float tinhluong() {
	float luong2;
	luong2=this.luong*1500;
	return luong2;
//	System.out.println("bac luong la: "+luong2);
}
@Override
public String toString() {
	return  ten +", " + luong+", "+this.tinhluong() ;
}
}
