package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int correctPassword = 44567;
		String correctUsername="Betha";
		
		Scanner scanner= new Scanner(System.in);	
		
		for(int trials=1; trials<=3; trials++) {
			System.out.println("input " + trials + ":Enter username");
			String username = scanner.nextLine();
		
		System.out.println("enter password");
		int password = scanner.nextInt();
	      scanner.nextLine();
		
		if(username.equals(correctUsername) && password ==correctPassword) {
			System.out.println("Login successful");
			break;
		}else { 			
			System.out.println("login Unsuccessful");
		}
		   if (trials == 3) {
               System.out.println("You have been disconnected");
           }
		}
	

	}

}
