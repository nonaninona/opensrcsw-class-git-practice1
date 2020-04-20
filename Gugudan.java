package gugudan;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();

		
		if(input == 0) {
			for(int i = 2;i<=9;i++) {
				for(int j = 1;j<=9;j++) {
					System.out.println(i + " X "  + j + " = " + i*j);
				}
			}
			return;
		}
		else if(input < 0) {
			System.out.println("구구단 출력 불가");
			return;
		}
		for(int i=1;i<=9;i++) {
			System.out.println(input + " X " + i + " = " + input*i);
		}
		
	}
}
