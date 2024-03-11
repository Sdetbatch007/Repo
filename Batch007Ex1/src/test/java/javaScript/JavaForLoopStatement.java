package javaScript;

public class JavaForLoopStatement {

	public static void main(String[] args) {
		int Program = 3;
		if (Program == 1) {
			int num = 3;
			for (int i = 1; i <= 10; i++) {

				System.out.println(num + "*" + i + "=" + (num * i));
			}
		} else if (Program == 2)

			for (int i = 20; i <= 60; i = i + 2) {
				System.out.println("print even numbers :" + i);
			}
		else if (Program == 3)
			for (int i = 1; i <= 20; i++) {
				if (i % 2 == 1)
					System.out.println("print odd number:" + i);
			}

	}
}