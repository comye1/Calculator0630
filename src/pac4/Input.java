package pac4;

import java.util.Scanner;

/*
 * 문자열(수식) 입력받고 분리하여 배열에 저장하기
 */
public class Input {

	static String[] getLine(Scanner scan) {
		System.out.print("수식 입력 : ");
		String value=scan.nextLine();
		String[] values=value.split(" ");
		return values;
	}
}
