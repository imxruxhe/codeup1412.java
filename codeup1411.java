package ch10;

import java.util.Arrays;
import java.util.Scanner;

public class codeup1411{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] card = new int[50];
		
		for(int i=0;i<num-1;i++) {
			card[i]=scan.nextInt();
		}
		Arrays.sort(card,0,num-1);
		
		for(int i=0;i<num;i++) {
			if(card[i]!=i+1) {
				System.out.println(i+1);
				break;
			}
		}
	}
}

