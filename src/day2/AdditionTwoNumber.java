package day2;

import java.util.Scanner;

public class AdditionTwoNumber {
     //for class name follow Pascal case  MahendraSinghDhoni...
	//For variable camelCase like mahendraSinghDhoni
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //ctrl+ shift + O (orange)
		System.out.println("Enter number 1: ");
		int n1 = sc.nextInt();
		System.out.println("Enter number 2: ");
		int n2 = sc.nextInt();
		int sum = n1+n2;
		System.out.println("sum is : "+sum);
	}
}
