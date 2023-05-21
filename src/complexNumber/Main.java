package complexNumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of test cases:-");
		int t = sc.nextInt();
		while(t-- > 0) {
			System.out.println("Enter x and y value of 1st complex number:-");
			ComplexNumber c1 = new ComplexNumber(sc.nextInt(), sc.nextInt());
			System.out.println("Enter x and y value of 2nd complex number:-");
			ComplexNumber c2 = new ComplexNumber(sc.nextInt(), sc.nextInt());
			System.out.println("Enter your operation like 'add' or 'substract' or 'multiply':-");
			String ch = sc.next();
			if(ch.equalsIgnoreCase("add")) {
				ComplexNumber res = new ComplexNumber().addition(c1, c2);
				System.out.println("Addition is "+ res.getX() + (res.getY() < 0 ? '-' : '+') + Math.abs(res.getY())+'i');
			}
			else if(ch.equalsIgnoreCase("substract")) {
				ComplexNumber res = new ComplexNumber().substraction(c1, c2);
				System.out.println("Substraction is "+ res.getX() + (res.getY() < 0 ? '-' : '+') + Math.abs(res.getY())+'i');
			}
			else if(ch.equalsIgnoreCase("multiply")) {
				ComplexNumber res = new ComplexNumber().multiplication(c1, c2);
				System.out.println("Substraction is "+ res.getX() + (res.getY() < 0 ? '-' : '+') + Math.abs(res.getY())+'i');
			}
			else {
				System.out.println("You choose wrong operation, please select right operation:-");
				t += 1;
			}
		}

	}

}
