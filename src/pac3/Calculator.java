package pac3;


import java.util.Scanner;
public class Calculator {
	  
	  static int calculate(String symbol, int first, int second) {
	    // TODO ��Ģ ������ ����� ��� ���� ��ȯ
		  int result=0;
		  if(symbol.equals("+")) {
			  result = first+second;
			  System.out.println("���� : "+result);
		  }else if(symbol.equals("-")) {
			  result = first-second;
			  System.out.println("���� : "+result);
		  }else if(symbol.equals("*")) {
			  result = first*second;
			  System.out.println("���� : "+result);

		  }else if(symbol.equals("/")) {
			  result = first/second;
			  System.out.println("������ : "+result);

		  }else {
			  System.out.print("�����ڰ� �̻��մϴ�");
		  }
		  return result;
	  }


	  public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int result = Input.getFirstValue(scanner);

	    while (true) {
	      String symbol = Input.getSymbol(scanner);

	      if ("quit".equals(symbol)) {
	        Output.print(result);
	        break;
	      }

	      int second = Input.getSecondValue(scanner);

	      result = calculate(symbol, result, second);
	    }

	    scanner.close();
	  }
	}

















