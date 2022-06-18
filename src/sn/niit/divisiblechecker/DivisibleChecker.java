package sn.niit.divisiblechecker;

import java.util.Scanner;

public class DivisibleChecker {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		int num1,num2;
		
		System.out.println("Entrer le premier nombre:");
		num1=obj.nextInt();
		
		num2=obj.nextInt();
		
		if(num2==0) {
			System.out.println("le deuxieme nombre ne peut pas etre 0");
		}else {
			if(num1%num2==0) {
				System.out.println("le premier est divisible "
						+ "par le deuxieme nombre");
			}else {
				System.out.println("le premier n'est pas divisible "
						+ "par le deuxieme nombre");
				
			}
		}
		
	}

}
