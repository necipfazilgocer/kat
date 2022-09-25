package kuvvet;

import java.util.Scanner;

public class kuvvet {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int i,k;
		System.out.println("Bir sayı giriniz");
		i=scanner.nextInt();
		for(k=1;k<=i;k*=4)
		{
			System.out.println("4ün kuvvetleri- "+k);
		
		}
		
		for(k=1;k<=i;k*=5)
		{
			System.out.println("3ün kuvvetleri -"+k);
		
		}
		
		
	}
}
