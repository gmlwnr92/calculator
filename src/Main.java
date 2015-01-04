import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		char ch;

		int i, j, k, re = 0;

		Scanner input = new Scanner(System.in);
		Calculator obj = new Calculator();
		Calculator obj2 = new Calculator();

		quit1: while (true) {
			System.out.printf("\n");
			System.out.printf("안녕하세요. <십진수&16진수 계산기> 입니다.\n");
			System.out.printf("십진수 계산은 1번, 16진수 계산은 2번을 선택해 주세요 :");
			k = input.nextInt();

			if (k == 1) {

				buho: while (true) {

					System.out.printf("부호를 입력하세요 :\n ");

					try {

						ch = (char) (System.in.read());

						System.out.printf("숫자 2개를 입력하세요 : ");

						i = input.nextInt();

						j = input.nextInt();

						switch (ch) {

						case '+':
							System.out.format("result : " + obj.plus(i, j));
							break;

						case '*':

							System.out.println("result : "
									+ obj.multiplication(i, j));
							break;

						case '-':

							System.out.println("result : " + obj.minus(i, j));
							break;

						case '/':

							if (j == 0) {

								System.out.printf("#re: 나눌수 없는 숫자입니다.");

								return;

							}

							else

								System.out.println("result : "
										+ obj.division(i, j));

							break;

						default:
							System.out.printf("#re: 부호를 다시입력해 주세요!\n");
							continue buho;

						}

					} catch (IOException e) {

						e.printStackTrace();

					}
					continue quit1;
				}

			} else if (k == 2) {

				buho: while (true) {

					System.out.printf("부호를 입력하세요 :\n ");

					try {

						ch = (char) (System.in.read());

						System.out.printf("숫자 2개를 입력하세요 : ");

						i = input.nextInt();

						j = input.nextInt();

						switch (ch) {

						case '+':
							System.out.println("result : "+ Integer.toHexString(obj.hexadeciMalnumberPlus(
									i, j)).toUpperCase());
							break;

						case '*':

							System.out.println("result : "+ Integer.toHexString(obj.hexadeciMalnumberMultiplication(
									i, j)).toUpperCase());
									
							break;

						case '-':

							System.out.println("result : "+ Integer.toHexString(obj.hexadeciMalnumberMinus(
									i, j)).toUpperCase());
							break;

						case '/':

							if (j == 0) {

								System.out.printf("#re: 나눌수 없는 숫자입니다.");

								return;

							}

							else

								System.out.println("result : "+ Integer.toHexString(obj.hexadeciMalnumberDivision(
										i, j)).toUpperCase());

							break;

						default:
							System.out.printf("#re: 부호를 다시입력해 주세요! \n");
							continue buho;

						}

					} catch (IOException e) {

						e.printStackTrace();

					}
					continue quit1;
				}

			} else {
				System.out.printf("#re:잘못 입력하셨음-_-.\n");
			}
			continue quit1;

		}

	}
}
