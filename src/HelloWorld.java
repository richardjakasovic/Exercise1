import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello ASE2017 - How are you? :)");
		
		System.out.print("Plese enter your name: ");
		
		Scanner in = new Scanner(System.in);
		String userName = in.nextLine();
		
		HelloUser hu = new HelloUser(userName);
		hu.greetUser(userName);
		
	}

}
