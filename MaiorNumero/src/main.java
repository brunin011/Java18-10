//EscrevaumprogramaJavadenominadoMaiorNumero que receba dois números inteiros, lidos pelo teclado,e imprima o maior entre eles.
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler  = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: \n");
		int Numero = ler.nextInt();
		System.out.println("Digite o segundo numero: \n");
		int Numero2 = ler.nextInt();
		if(Numero > Numero2) {
			System.out.println("o maior numero é o " + Numero);
		}else {
			System.out.println("o maior numero é o " + Numero2);
		}

	}

}
