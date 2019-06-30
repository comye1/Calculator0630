package pac1;

import java.util.Scanner;
public class Test04 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String symbol="";
		int first,second;
		System.out.print("Ã¹¹øÂ° °ª ÀÔ·Â : ");
		first=scan.nextInt();
		while(true) {
			System.out.print("¿¬»êÀÚ ÀÔ·Â : ");
			symbol=scan.next();
			
			
			if(symbol.equals("quit")){
				break;
			}
			
			System.out.print("°ª ÀÔ·Â : ");
			second=scan.nextInt();
			
			if(symbol.equals("+")) {
				first=(first+second);
				System.out.println("µ¡¼À : "+first);
			}else if(symbol.equals("-")) {
				first=(first-second);
				System.out.println("»¬¼À : "+first);
			}else if(symbol.equals("*")) {
				first=(first*second);
				System.out.println("°ö¼À : "+first);
			}else if(symbol.equals("/")) {
				first=(first/second);
				System.out.println("³ª´°¼À : "+first);
			}else {
				break;
			}
		}
		System.out.println("¿¬»ê °á°ú : "+first);
		scan.close();
	}

}
