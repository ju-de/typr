package typr;

import java.util.Scanner;

public class Typr {
	public static void pad(){
		for(int i = 0; i<10; i++)
			System.out.println();
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String text;
		text = sc.nextLine();
		
		do{
			pad();
			System.out.print(text);
		}while(!text.equals(""));
	}
}
