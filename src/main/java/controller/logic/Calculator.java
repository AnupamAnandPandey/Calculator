package controller.logic;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Calculator implements IMathOperator{
      Scanner sc=new Scanner(System.in);
      int a= sc.nextInt();
      int b=sc.nextInt();
     
      public void substraction(int a, int b){
    	  int c=a-b;
    	  System.out.println("Difference is =" + c);
      }
	public void addition(int a, int b) {
		int d=a+b;
		System.out.println("Sum is =" + d);
	}
	 public void multiplication(int a, int b) {
		int m= a*b;
		System.out.println("Multiplication is =" +m);
	}
	@Test
	public void launchApp() {
		addition(a,b);
		substraction(a,b);
		multiplication(a, b);
	}
}


