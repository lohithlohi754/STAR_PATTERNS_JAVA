package com.patterns.JavaPatternPrograms;

public class DiamondPattern {
	public static void main(String[] args) {
		int n=5;
		//First Half Pyramid
		for(int i=1;i<n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		//First Half Pyramid
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<=n;k++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
