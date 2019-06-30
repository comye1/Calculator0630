package pac1;

import java.util.Scanner;
public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Ã¹¹øÂ° °ª ÀÔ·Â : ");
		int first=scan.nextInt();

		System.out.print("¿¬»êÀÚ ÀÔ·Â : ");
		String symbol=scan.next();
		
		System.out.print("µÎ¹øÂ° °ª ÀÔ·Â : ");
		int second=scan.nextInt();
		
		if(symbol.equals("+")) {
			System.out.println("µ¡¼À : "+(first+second));
		}else if(symbol.equals("-")) {
			System.out.println("»¬¼À : "+(first-second));
		}else if(symbol.equals("*")) {
			System.out.println("°ö¼À : "+(first*second));
		}else if(symbol.equals("/")) {
			System.out.println("³ª´°¼À : "+(first/second));
		}else {
			;
		}
		scan.close();
	}

}
