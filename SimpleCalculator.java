import java.util.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int a,b;
		String operator;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of a,b");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter the operator");
		operator=sc.next();
		switch(operator){
			case "+":
				System.out.println(a+ "+" +b+ "=" +(a+b));
				break;
				case "-":
				System.out.println(a+ "-" +b+ "=" +(a-b));
				break;
				case "*":
				System.out.println(a+ "*" +b+ "=" +(a*b));
				break;
				case "/":
				if(b!=0)
				System.out.println(a+ "/" +b+ "=" +(a/b));
				else
				System.out.println("Division by zero is not allowed!");
				break;
				case "^":
				System.out.println(a+ "^" +b+ "=" +(Math.pow(a,b)));
				break;
				default : System.out.println("Invalid operator!");
				
	}
}
}