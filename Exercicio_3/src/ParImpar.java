
public class ParImpar {

	public static void main(String[] args) {
		int i;
		int impar = 0;
		int par = 0;
		
		System.out.println("Soma de numeros ímpares e pares:\n");
		
		for(i=0;i<=30;i++) {
			if(i %2 !=0)
				impar += i;
			else
				par = par*i;
			
		}
		System.out.println("A soma dos valores impares e:"+ impar);
		System.out.println("A soma dos valores pares e: " + par);
	}

}

