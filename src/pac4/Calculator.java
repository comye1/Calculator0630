package pac4;

import java.util.Scanner;

public class Calculator {
	
	static int Calculate(String[] values) {
		int first=Integer.parseInt(values[0]);
		int result=first;
		for(int i=1; i<values.length;i+=2) {
			int second=Integer.parseInt(values[i+1]);
			String symbol=values[i];
			  if(symbol.equals("+")) {
				  System.out.printf("%d + %d = %d\n",result,second,result+second);
				  result = result+second;
			  }else if(symbol.equals("-")) {
				  System.out.printf("%d - %d = %d\n",result,second,result-second);
				  result = result-second;
			  }else if(symbol.equals("*")) {
				  System.out.printf("%d * %d = %d\n",result,second,result*second);
				  result = result*second;
			  }else if(symbol.equals("/")) {
				  System.out.printf("%d / %d = %d\n",result,second,result/second);
				  result = result/second;
			  }else {
				  System.out.println("연산자가 이상합니다");
			  }
			  
		}
		System.out.println("계산 완료");
		return result;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String[] values=Input.getLine(scan);
		Output.print(Calculate(values));
		

	}

}
