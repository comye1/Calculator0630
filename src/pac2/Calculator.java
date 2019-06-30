package pac2;

import java.util.Scanner;
public class Calculator {
	  static int getFirstValue(Scanner scanner) {
	    // TODO 첫 번째 값을 입력 받아 반환
		  System.out.print("첫 번째 값 : ");
		  int first=scanner.nextInt();
		  return first;
	  }

	  static int getSecondValue(Scanner scanner) {
	    // TODO 두 번째 값을 입력 받아 반환
		  System.out.print("두 번째 값 : ");
		  int second=scanner.nextInt();
		  return second;
	  }

	  static String getSymbol(Scanner scanner) {
	    // TODO 연산자를 입력 받아 반환
		  String symbol="";
		while(true) {
			  System.out.print("연산자 : ");
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
	    // TODO 사칙 연산을 계산해 결과 값을 반환
		  if(symbol.equals("+")) {
			  return first+second;
		  }else if(symbol.equals("-")) {
			  return first-second;
		  }else if(symbol.equals("*")) {
			  return first*second;
		  }else if(symbol.equals("/")) {
			  return first/second;
		  }else {
			  System.out.print("연산자가 이상합니다");
			  return 0;
		  }
	  }

	  static void print(int result) {
	    // TODO 실행 결과를 출력
		  System.out.print("연산 결과 : " +result);
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