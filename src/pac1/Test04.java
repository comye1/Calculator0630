package pac1;

import java.util.Scanner;
public class Test04 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String symbol="";
		int first,second;
		System.out.print("ù��° �� �Է� : ");
		first=scan.nextInt();
		while(true) {
			System.out.print("������ �Է� : ");
			symbol=scan.next();
			
			
			if(symbol.equals("quit")){
				break;
			}
			
			System.out.print("�� �Է� : ");
			second=scan.nextInt();
			
			if(symbol.equals("+")) {
				first=(first+second);
				System.out.println("���� : "+first);
			}else if(symbol.equals("-")) {
				first=(first-second);
				System.out.println("���� : "+first);
			}else if(symbol.equals("*")) {
				first=(first*second);
				System.out.println("���� : "+first);
			}else if(symbol.equals("/")) {
				first=(first/second);
				System.out.println("������ : "+first);
			}else {
				break;
			}
		}
		System.out.println("���� ��� : "+first);
		scan.close();
	}

}
