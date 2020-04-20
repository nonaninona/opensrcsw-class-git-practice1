package gugudan;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		
		for(int i=1;i<=9;i++) {
			System.out.println(input + " X " + i + " = " + input*i);
		}
		
	}
}
