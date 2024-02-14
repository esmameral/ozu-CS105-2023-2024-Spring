package week1.examples;

import java.text.SimpleDateFormat;
import java.lang.System;

public class HelloJavaExample {

	public static void main(String[] args) {
		double radius=6.8;
				
		char letter='A';
		int height=10;
		double PI=3.14;
		
		double volumeSphere=4*PI*radius*radius*radius/3;
		double volumeCylinder=PI*radius*radius*height;
		System.out.println(volumeSphere+"\n"+volumeCylinder);

	}

}
 