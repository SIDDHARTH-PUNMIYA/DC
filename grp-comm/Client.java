import java.rmi.Naming;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
	try {
		 Application  stub = (Application)Naming.lookup("rmi://localhost:5000/calc");
	Scanner sc = new Scanner(System.in);
		 while(true) {
	

System.out.println(" Enter 1 for Add \n 2 for Sub \n 3 for Mul \n 4 for Div \n 5 to exit \n");
int choice=sc.nextInt();
System.out.println("Enter 1 st no");
int x= sc.nextInt();

System.out.println("Enter 2nd no");
int y = sc.nextInt();

switch(choice) {
case 1:
	System.out.println(stub.add(x,y));
	break;
case 2:
	System.out.println(stub.add(x,y));
	break;
case 3:
	System.out.println(stub.add(x,y));
	break;
case 4:
	System.out.println(stub.add(x,y));
	break;
case 5:
	System.exit(0);
	break;
}

	}
		 
		
	} catch (Exception e) {
		System.out.println(e);
	}
		
		
	}

}
