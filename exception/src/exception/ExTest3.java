package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExTest3 {

	public static void main(String[] args) {
		int num[] = new int [5];
		Scanner input = new Scanner(System.in);
		System.out.println("hi");
		//Ű����� ���� 5���� �Է¹޾� �迭 num�� ����
		for(int i = 0 ; i<num.length; i++) {
			try {
				num[i] = input.nextInt();
			}
			catch (InputMismatchException e) {
				//���� ���� i������ �ٽ�
			}
		}
		//�迭�� ����� �� 5���� ���
		for(int i = 0; i<num.length; i++) {
			System.out.println(num[i]);
		}
	}

}
