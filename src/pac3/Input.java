package pac3;

import java.util.Scanner;

public class Input {
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
}
