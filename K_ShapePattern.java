package com.patterns.JavaPatternPrograms;

public class K_ShapePattern {
	public static void main(String[] args) {
		int n=5;
		//Upper decreasing triangle
		//We have to reduce one iteration to get shape
		//we can write i>=1 we will not get shape
		for(int i=n;i>1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		//Lower increasing triangle
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
