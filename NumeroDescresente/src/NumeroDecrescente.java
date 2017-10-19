
import java.util.Scanner;
public class NumeroDecrescente {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero:\n");
		int n1 = ler.nextInt();
		int i=n1;
		while(i>=0) {
			System.out.println(i--);
		}

	}

}
