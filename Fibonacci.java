package lab2;

public class Fibonacci {
	public static int getFibonacci(int n) {
		if (n == 1 || n == 2)
			return 1;
		return getFibonacci(n - 1) + getFibonacci(n - 2);
	}

	public static void printFibonacci(int n) {

		int num1 = 0, num2 = 1;
		System.out.print(num1 + " " + num2);

		for (int i = 2; i < n; i++) {
			int sum = num1 + num2;
			System.out.print(" " + sum);
			num1 = num2;
			num2 = sum;
		}

	}

	public static void main(String[] args) {
		int n = 10;
		System.out.println("So pibonacci tuong ung la: " + getFibonacci(n));
		System.out.print("Chuoi Fibonacci dua tren so " + n + " la:");
		printFibonacci(n);
	}
}
