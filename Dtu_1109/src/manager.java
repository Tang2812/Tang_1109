import java.util.Scanner;

public class manager extends employee {
private String phong_ban;
private float phu_cap;
public String getPhong_ban() {
	return phong_ban;
}
public void setPhong_ban(String phong_ban) {
	this.phong_ban = phong_ban;
}
public float getPhu_cap() {
	return phu_cap;
}
public void setPhu_cap(float phu_cap) {
	this.phu_cap = phu_cap;
}
public manager() {
}
void input() {
	super.input();
	System.out.println("nhao vao phong ban: ");
	Scanner sc=new Scanner(System.in);
	this.phong_ban=sc.nextLine();
	System.out.println("nhap vao phu cap: ");
	this.phu_cap=Float.parseFloat(sc.nextLine());
}
float tinhluong() {
	float luong3;
	luong3=super.tinhluong()+this.phu_cap;
	return luong3;
}
@Override
public String toString() {
	return super.getTen() +", " + super.getLuong()+", "+this.tinhluong()+", "+ phong_ban + ", " + phu_cap ;
}

}
