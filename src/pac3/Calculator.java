package pac3;


import java.util.Scanner;
public class Calculator {
	  
	  static int calculate(String symbol, int first, int second) {
	    // TODO »çÄ¢ ¿¬»êÀ» °è»êÇØ °á°ú °ªÀ» ¹ÝÈ¯
		  int result=0;
		  if(symbol.equals("+")) {
			  result = first+second;
			  System.out.println("µ¡¼À : "+result);
		  }else if(symbol.equals("-")) {
			  result = first-second;
			  System.out.println("»¬¼À : "+result);
		  }else if(symbol.equals("*")) {
			  result = first*second;
			  System.out.println("°ö¼À : "+result);

		  }else if(symbol.equals("/")) {
			  result = first/second;
			  System.out.println("³ª´°¼À : "+result);

		  }else {
			  System.out.print("¿¬»êÀÚ°¡ ÀÌ»óÇÕ´Ï´Ù");
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

















