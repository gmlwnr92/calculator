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
			System.out.printf("�ȳ��ϼ���. <������&16���� ����> �Դϴ�.\n");
			System.out.printf("������ ����� 1��, 16���� ����� 2���� ������ �ּ��� :");
			k = input.nextInt();

			if (k == 1) {

				buho: while (true) {

					System.out.printf("��ȣ�� �Է��ϼ��� :\n ");

					try {

						ch = (char) (System.in.read());

						System.out.printf("���� 2���� �Է��ϼ��� : ");

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

								System.out.printf("#re: ������ ���� �����Դϴ�.");

								return;

							}

							else

								System.out.println("result : "
										+ obj.division(i, j));

							break;

						default:
							System.out.printf("#re: ��ȣ�� �ٽ��Է��� �ּ���!\n");
							continue buho;

						}

					} catch (IOException e) {

						e.printStackTrace();

					}
					continue quit1;
				}

			} else if (k == 2) {

				buho: while (true) {

					System.out.printf("��ȣ�� �Է��ϼ��� :\n ");

					try {

						ch = (char) (System.in.read());

						System.out.printf("���� 2���� �Է��ϼ��� : ");

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

								System.out.printf("#re: ������ ���� �����Դϴ�.");

								return;

							}

							else

								System.out.println("result : "+ Integer.toHexString(obj.hexadeciMalnumberDivision(
										i, j)).toUpperCase());

							break;

						default:
							System.out.printf("#re: ��ȣ�� �ٽ��Է��� �ּ���! \n");
							continue buho;

						}

					} catch (IOException e) {

						e.printStackTrace();

					}
					continue quit1;
				}

			} else {
				System.out.printf("#re:�߸� �Է��ϼ���-_-.\n");
			}
			continue quit1;

		}

	}
}
