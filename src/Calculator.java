import java.util.Scanner;

public class Calculator {

	int plus(int i, int j) {

		int result = i + j;

		return result;

	}

	int multiplication(int i, int j) {

		int result = i * j;

		return result;

	}

	int minus(int i, int j) {

		int result = i - j;

		return result;

	}

	int division(int i, int j) {

		int result = i / j;

		return result;

	}

	/********************** 16진법 메소드 ******************************/

	String hexadeciMalnumberPlus(int i, int j) {

		int result = i + j;

		String hex = Integer.toHexString(result);

		return hex;

	}

	String hexadeciMalnumberMultiplication(int i, int j) {

		int result = i * j;
		String hex = Integer.toHexString(result);

		return hex;

	}

	String hexadeciMalnumberMinus(int i, int j) {

		int result = i - j;

		String hex = Integer.toHexString(result);

		return hex;

	}

	String hexadeciMalnumberDivision(int i, int j) {

		int result = i / j;

		String hex = Integer.toHexString(result);

		return hex;

	}

}
