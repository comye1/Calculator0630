package pac1;

import java.util.Scanner;
public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("ù��° �� �Է� : ");
		int first=scan.nextInt();

		System.out.print("������ �Է� : ");
		String symbol=scan.next();
		
		System.out.print("�ι�° �� �Է� : ");
		int second=scan.nextInt();
		
		if(symbol.equals("+")) {
			System.out.println("���� : "+(first+second));
		}else if(symbol.equals("-")) {
			System.out.println("���� : "+(first-second));
		}else if(symbol.equals("*")) {
			System.out.println("���� : "+(first*second));
		}else if(symbol.equals("/")) {
			System.out.println("������ : "+(first/second));
		}else {
			;
		}
		scan.close();
	}

}
