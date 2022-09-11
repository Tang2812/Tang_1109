import java.util.Scanner;

public class bt {
//Khai bao lop sinh vien gom co: 
//	ho va ten
//	que quan
//	diem tb
//	khai bao lop lop hoc
//	ten lop
//	so luong sinh vien
//	danh sach cac sinh vien
//	nhap danh sach
//	in danh sach
//	sap xep danh sach theo ten
//	dem so sinh vien que o hue
//	cộng điểm trung bình lên 0.3 cho nhữn bạn quê ở Quảng Nam, nhưng không quá 10.

	public static class sinhvien {
		private String hoVaTen;
		private String queQuan;
		private float diemTrungBinh;

		public String getHoVaTen() {
			return hoVaTen;
		}

		public void setHoVaTen(String hoVaTen) {
			this.hoVaTen = hoVaTen;
		}

		public String getQueQuan() {
			return queQuan;
		}

		public void setQueQuan(String queQuan) {
			this.queQuan = queQuan;
		}

		public float getDiemTrungBinh() {
			return diemTrungBinh;
		}

		public void setDiemTrungBinh(float diemTrungBinh) {
			this.diemTrungBinh = diemTrungBinh;
		}

		@Override
		public String toString() {
			return hoVaTen + ", " + queQuan + ", " + diemTrungBinh;
		}

	}

	public static class lopHoc {
		private String tenlop;
		private int soluong;
		private sinhvien[] dssv;

		public String getTenlop() {
			return tenlop;
		}

		public void setTenlop(String tenlop) {
			this.tenlop = tenlop;
		}

		public int getSoluong() {
			return soluong;
		}

		public void setSoluong(int soluong) {
			this.soluong = soluong;
		}

		public sinhvien[] getDssv() {
			return dssv;
		}

		public void setDssv(sinhvien[] dssv) {
			this.dssv = dssv;
		}

		void nhapds() {
			Scanner sc = new Scanner(System.in);
			System.out.println("nhap vao ten lop: ");
			this.tenlop = sc.nextLine();
			System.out.println("nhap so luong sinh vien: ");
			this.soluong = Integer.parseInt(sc.nextLine());
			this.dssv = new sinhvien[this.soluong];
			for (int i = 0; i < this.soluong; i++) {
				dssv[i] = new sinhvien();
				String hvt;
				String quequan;
				float dtb;
				System.out.println("nhap vao ho va ten: ");
				hvt = sc.nextLine();
				System.out.println("nhap vao que quan: ");
				quequan = sc.nextLine();
				System.out.println("nhap vao diem trung binh: ");
				dtb = Float.parseFloat(sc.nextLine());
				this.dssv[i].setHoVaTen(hvt);
				this.dssv[i].setQueQuan(quequan);
				this.dssv[i].setDiemTrungBinh(dtb);
			}

		}

		void inds() {
			System.out.println("danh sach sinh vien: ");
			for (int i = 0; i < this.soluong; i++) {
				System.out.println(this.dssv[i]);
			}
		}

		void sapxep() {
			for (int i = 0; i < this.soluong - 1; i++) {
				for (int j = i + 1; j < this.soluong; j++) {
					String str1, str2;
					str1 = this.dssv[i].hoVaTen.toLowerCase();
					str2 = this.dssv[j].hoVaTen.toLowerCase();
					if (str1.compareTo(str2) > 0) {
						sinhvien t = new sinhvien();
						t = dssv[i];
						dssv[i] = dssv[j];
						dssv[j] = t;
					}
				}
			}
		}

		void dem() {
			int dem = 0;
			for (int i = 0; i < this.soluong; i++) {
				String qq = this.dssv[i].getQueQuan().toLowerCase();
				if (qq.compareTo("hue") == 0) {
					dem++;
				}
			}
			System.out.println("co " + dem + "sinh vien o Hue");
		}

		void congdiem() {
			for (int i = 0; i < this.soluong; i++) {
				String qq = this.dssv[i].getQueQuan().toLowerCase();
				if (qq.compareTo("quang nam") == 0) {
					float diem;
					diem = (float) (this.dssv[i].getDiemTrungBinh() + 0.3);
					if (diem > 10) {
						diem = 10;
					}
					;
					this.dssv[i].setDiemTrungBinh(diem);
				}
			}
		}

	}

	public static void main(String[] args) {
		lopHoc a = new lopHoc();
		a.nhapds();
		a.inds();
		a.sapxep();
		a.inds();
		a.dem();
		a.congdiem();
		a.inds();
	}

}
