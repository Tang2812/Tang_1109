
public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello Java";
		String str2 = new StringBuffer("Hello").append(" Java").toString();
		String str3 = str2.intern();
		System.out.println("str1 == str2 " + (str1 == str2));
		System.out.println("str1 == str3 " + (str1 == str3));

	}
}
