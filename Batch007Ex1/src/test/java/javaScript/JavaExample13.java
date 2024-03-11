package javaScript;

public class JavaExample13 {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 30;
		if (a > b && a > c) {
			System.out.println("a value big");
		} else if (b > c && b > a) {
			System.out.println("b value big");
		} else if (c > a && c > b) {
			System.out.println("c value big");
		} else {
			System.out.println("please check value");
		}
	}

}
