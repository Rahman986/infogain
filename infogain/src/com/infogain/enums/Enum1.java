package com.infogain.enums;

public class Enum1 {
	enum Beer{
		KF,RC,KO,KP
	}
public static void main(String[] args) {
	
	Beer b=Beer.KP;
	
	switch(b) {
	case KF:
		System.out.println("KF Brand");
		break;
	case RC:
		System.out.println("RC Brand");
		break;
	case KO:
		System.out.println("KO Brand");
		break;
	case KP:
		System.out.println("KP Brand");
		default:
			System.out.println("Choice your own Items");
	}
	
}
}
/*enum Beer{
	KF,RC,KO,KP
}*/