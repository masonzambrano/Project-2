package zambrano_p1;

import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		
		int fourDigit, n1, n2, n3, n4, temp;
		
		Scanner scnr = new Scanner(System.in);
		
		fourDigit = scnr.nextInt();
		
		scnr.close();
		
		n4 = fourDigit % 10;
		fourDigit = fourDigit / 10;
		n4 = (n4 + 7) % 10;
		
		n3 = fourDigit % 10;
		fourDigit = fourDigit / 10;
		n3 = (n3 + 7) % 10;
		
		n2 = fourDigit % 10;
		fourDigit = fourDigit / 10;
		n2 = (n2 + 7) % 10;
		
		n1 = fourDigit % 10;
		fourDigit = fourDigit / 10;
		n1 = (n1 + 7) % 10;
		
		temp = n1;
		n1 = n3;
		n3 = temp;
		
		temp = n2;
		n2 = n4;
		n4 = temp;
		
		System.out.println("Encrypted integer: " + n1 + n2 + n3 + n4);

	}

}
