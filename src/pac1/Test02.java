package pac1;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("ù ��° ��: ");
	    int first = scanner.nextInt();
	    System.out.println(first);

	    System.out.println("�� ��° ��: ");
	    int second=scanner.nextInt();
	    System.out.println(second);
	    
	    System.out.println("���� : "+(first+second));
		System.out.println("���� : "+(first-second));
		System.out.println("���� : "+(first*second));
		System.out.println("������ : "+(first/second));
	    
		scanner.close();
	}

}
