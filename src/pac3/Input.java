package pac3;

import java.util.Scanner;

public class Input {
	static int getFirstValue(Scanner scanner) {
	    // TODO ù ��° ���� �Է� �޾� ��ȯ
		  System.out.print("ù ��° �� : ");
		  int first=scanner.nextInt();
		  return first;
	  }

	  static int getSecondValue(Scanner scanner) {
	    // TODO �� ��° ���� �Է� �޾� ��ȯ
		  System.out.print("�� ��° �� : ");
		  int second=scanner.nextInt();
		  return second;
	  }

	  static String getSymbol(Scanner scanner) {
	    // TODO �����ڸ� �Է� �޾� ��ȯ
		  String symbol="";
		while(true) {
			  System.out.print("������ : ");
			  symbol=scanner.next();
			  if(symbol.equals("+")) {
				  break;
			  }else if(symbol.equals("-")) {
				  break;
			  }else if(symbol.equals("*")) {
				  break;
			  }else if(symbol.equals("/")) {
				  break;
			  }else if(symbol.equals("quit")) {
				  break;
			  }
		}
		  return symbol;
	  }
}
