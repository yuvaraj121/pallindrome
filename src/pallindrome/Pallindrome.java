package pallindrome;

import java.util.Scanner;

public class Pallindrome {
	public static void main(String[] args) {
		
		System.out.println(" Enter the number or String");
		Scanner input = new Scanner(System.in);
		String Str = input.nextLine();
		String Str1 = " ";
		for(int i=Str.length()-1;i>=0;i--) {
			Str1 = Str1+Str.charAt(i);
		}
			System.out.println(" Reversed String is \n "+Str1);
			if(Str.equals(Str1)) {
				System.out.println(" The String is pallindrome");
				
			}
			else
			{
				System.out.println(" The String is not a pallindrome");
			}
			
		}
	}


