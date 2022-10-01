import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	List<employee> list = new ArrayList<>();

    while(true){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose employee/ manager/stop(e/m/s/): ");
        String choose = scanner.nextLine();
        if(choose.equals("e")){
            employee employee = new employee();
            employee.input();
            list.add(employee);
        }else if(choose.equals("m")){
            manager manage = new manager();
            manage.input();
            list.add(manage);
        }else{
            break;
        }
    }
		String chon2;
	
//	for(int j=0;j<=n;j++) {
//		System.out.println(a[j]);
//	}
	     for(employee e : list){
	    	 if(e instanceof manager)
	           System.out.println(e);
	        }
}
}
