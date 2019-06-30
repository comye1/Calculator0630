package pac2;

import java.util.Scanner;
public class Calculator {
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

	  static int calculate(String symbol, int first, int second) {
	    // TODO ��Ģ ������ ����� ��� ���� ��ȯ
		  if(symbol.equals("+")) {
			  return first+second;
		  }else if(symbol.equals("-")) {
			  return first-second;
		  }else if(symbol.equals("*")) {
			  return first*second;
		  }else if(symbol.equals("/")) {
			  return first/second;
		  }else {
			  System.out.print("�����ڰ� �̻��մϴ�");
			  return 0;
		  }
	  }

	  static void print(int result) {
	    // TODO ���� ����� ���
		  System.out.print("���� ��� : " +result);
	  }

	  public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int result = getFirstValue(scanner);

	    while (true) {
	      String symbol = getSymbol(scanner);

	      if ("quit".equals(symbol)) {
	        print(result);
	        break;
	      }

	      int second = getSecondValue(scanner);

	      result = calculate(symbol, result, second);
	    }

	    scanner.close();
	  }
	}