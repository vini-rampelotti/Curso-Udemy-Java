package curso_programacao;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		//Chamar a função de scanner que recebe dados do teclado
		Scanner sc = new Scanner(System.in);
		
		/*
		String x;
		x = sc.next();			//--------------> Recebimento de dado através da variável criada
		System.out.println("Você digitou: "+ x);
		
		int x;
		x = sc.nextInt();
		System.out.println("Número digitado: "+ x);
		
		double x;
		x = sc.nextDouble();
		System.out.println("Número digitado: "+ x);
		
		char x;
		x = sc.next().charAt(0);
		System.out.println("Você digitou: " + x);
		*/
		
		String x;
		int y;
		double z;
		System.out.println("Favor digitar qualquer coisa: ");
		x = sc.next();
		System.out.println("Favor digitar um número: ");
		y = sc.nextInt();
		System.out.println("Favor digitar um número decimal: ");
		z = sc.nextDouble();
		System.out.println("Dados digitado:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
	}

}
