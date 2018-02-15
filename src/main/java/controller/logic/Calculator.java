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
	@Test
	public void launchApp() {
		addition(a,b);
		substraction(a,b);
	}
}


