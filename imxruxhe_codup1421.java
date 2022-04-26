package ch10;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		int [] alphabet = new int[26];
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine(); // str-> oh my god! 이 저장
		String[] a = str.split(""); // a ->  oh my god!을 하나하나 나눠서 저장해
		String b = "abcdefghijklmnopqrstuvwxyz";
		String[] c = b.split("");  //  c -> a,b,c,d 하나하나 나눠서 저장해준다.
		
		for(int i=0;i<a.length;i++) {
			for (int j=0;j<c.length;j++) {
				if(a[i].equals(c[j])) {
					alphabet[j]++; 
				}
			}
		}
		for(int i=0;i<alphabet.length;i++) {
			System.out.println(c[i]+":"+alphabet[i]);
		}
	}
}
		