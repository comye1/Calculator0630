package pac4;

import java.util.Scanner;

/*
 * ���ڿ�(����) �Է¹ް� �и��Ͽ� �迭�� �����ϱ�
 */
public class Input {

	static String[] getLine(Scanner scan) {
		System.out.print("���� �Է� : ");
		String value=scan.nextLine();
		String[] values=value.split(" ");
		return values;
	}
}
