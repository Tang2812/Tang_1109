package dtu_2409;

import java.util.ArrayList;
import java.util.Scanner;

abstract class dongvat {
	private float cannang;
	private String thucan;
	private String gioitinh;

	public float getCannang() {
		return cannang;
	}

	public void setCannang(float cannang) {
		this.cannang = cannang;
	}

	public String getThucan() {
		return thucan;
	}

	public void setThucan(String thucan) {
		this.thucan = thucan;
	}

	public String getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	};

	public abstract void nhap();

	public abstract void in() ;
}

	class meo extends dongvat {
		private String tenmeo;
		private int tuoi;

		public String getTenmeo() {
			return tenmeo;
		}

		public void setTenmeo(String tenmeo) {
			this.tenmeo = tenmeo;
		}

		public int getTuoi() {
			return tuoi;
		}

		public void setTuoi(int tuoi) {
			this.tuoi = tuoi;
		}

		public void nhap() {
			Scanner sc = new Scanner(System.in);
			System.out.println("nhap vao can nang: ");
			float cannang = Float.parseFloat(sc.nextLine());
			super.setCannang(cannang);
			System.out.println("nhap vao gioi tinh: ");
			String gioitinh = sc.nextLine();
			super.setGioitinh(gioitinh);
			System.out.println("nhap vao thuc an: ");
			String thucan = sc.nextLine();
			super.setThucan(thucan);
			System.out.println("nhap vao ten meo: ");
			this.tenmeo = sc.nextLine();
			System.out.println("nhap vao tuoi meo: ");
			this.tuoi = Integer.parseInt(sc.nextLine());
		}

		public void in() {
			if (super.getGioitinh().compareTo("cai")==0) {
				System.out.print("toi la mot co ");
			} else {
				System.out.print("toi la mot chu ");
			}
			System.out.println("meo ten: "+this.tenmeo+" "+this.tuoi+" tuoi "+"nang: "+super.getCannang()+" thuc an la: "+super.getThucan());
		}
	}
class cho extends dongvat{
private String giongcho;
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao can nang: ");
		float cannang = Float.parseFloat(sc.nextLine());
		super.setCannang(cannang);
		System.out.println("nhap vao gioi tinh: ");
		String gioitinh = sc.nextLine();
		super.setGioitinh(gioitinh);
		System.out.println("nhap vao thuc an: ");
		String thucan = sc.nextLine();
		super.setThucan(thucan);
		System.out.println("nhap vao giong cho: ");
		this.giongcho=sc.nextLine();
		
	}

	public void in() {
		if (super.getGioitinh().compareTo("cai")==0)   {
			System.out.print("toi la mot co ");
		} else {
			System.out.print("toi la mot chu ");
		}
		System.out.println("cho thuoc loai: "+this.giongcho+" "+"nang: "+super.getCannang()+"thuc an la: "+super.getThucan());
	}	
	}

public class bt {
public static void main(String[] args) {
	ArrayList<dongvat> t= new ArrayList<>();
	Scanner sc= new Scanner(System.in);
	while(true) {
		String chon;
		System.out.println("cho hay meo? (c/m)");
		
		chon= sc.nextLine().toLowerCase();
		if(chon.compareTo("c")==0) {
			cho a=new cho();
			a.nhap();
			t.add(a);
		}else {
			if(chon.compareTo("m")==0) {
				meo b=new meo();
				b.nhap();
				t.add(b);
		}
	}
		String chon2;
		System.out.println("tiep tuc khong? (y/n)");
		chon2=sc.nextLine().toLowerCase();
		if(chon2.compareTo("n")==0) {
			break;
		}
}
	for(int i=0;i<t.size();i++) {
		t.get(i).in();
	}
}
}