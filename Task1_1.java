package lab2;

public class Task1_1 {
	public static int getSn1(int n) {
		if (n == 1)
			return 1;
		return (int) (getSn1(n - 1) + Math.pow(-1, n + 1) * n);

	}

	public static int getSn2(int n) {
		if (n == 1)
			return 1;
		return getSn2(n - 1) + calculateFactorial(n);
	}

	private static int calculateFactorial(int n) {
		if (n == 1)
			return 1;
		return n * calculateFactorial(n - 1);

	}

	public static int getSn3(int n) {
		if (n == 1)
			return 1;
		return (int) ((int) getSn3(n - 1) + Math.pow(n, 2));
	}

	public static double getSn4(int n) {
		if (n == 0)
			return 1;
		return getSn4(n - 1) + 1 / fn(n);
	}

	private static double fn(int n) {
		if (n == 0)
			return 1;
		return fn(n - 1) * (2 * n);
	}

	public static void main(String[] args) {
		int n = 5;
		System.out.println(getSn1(n));
		System.out.println("--------");
		System.out.println(getSn2(n));
		System.out.println("--------");
		System.out.println(getSn3(n));
		System.out.println("--------");
		System.out.println(getSn4(n));
	}
}
