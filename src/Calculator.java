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

	/********************** 16진수처리 메소드 추가 ******************************/

	int  hexadeciMalnumberPlus(int i, int j) {

		int result = i + j;

		return result;

	}

	int  hexadeciMalnumberMultiplication(int i, int j) {

		int result = i * j;
		return result;

	}

	int  hexadeciMalnumberMinus(int i, int j) {

		int result = i - j;

		return result;

	}

	int  hexadeciMalnumberDivision(int i, int j) {

		int result = i / j;

		return result;

	}




private String getDecToHex(String dec){
    
	  Long intDec = Long.parseLong(dec);
	  return Long.toHexString(intDec).toUpperCase();

	 } 

}
