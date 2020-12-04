import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("This program will take 3 numbers and sort them in ascending order.");
		System.out.println ("Please enter 3 numbers with spaces in between them:");
		
		int num1 = sc.nextInt();
		int num2 =sc.nextInt();
		int num3 =sc.nextInt();
		
		
		//System.out.print(num1);
		//System.out.print(num2);
		//System.out.print(num3);
		
		if (num1 > num2) {
			int temp =num1;
			num1 = num2;
			num2 = temp;
	}
		if (num2 > num3) {
			int temp =num2;
			num2 = num3;
			num3 = temp;
		}
		if (num1 > num2) {
			int temp =num1;
			num1 = num2;
			num2 = temp;
	}
		
	
		System.out.println ("The ordered numbers are:" + num1 + "  " + num2 + "  " + num3);	
		
			
				
	  }
	}