package pack1;

import java.util.Scanner;

public class Factirial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		Scanner s=new Scanner(System.in);
		int a,res=1;
		a=s.nextInt();
		while(a>0)
		{
			res*=a;
			a--;
		}
		System.out.println("Factorial of number is :"+res);
		

	}

}
