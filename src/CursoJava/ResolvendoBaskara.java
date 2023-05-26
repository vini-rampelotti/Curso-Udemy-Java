package CursoJava;

import java.util.Scanner;

public class ResolvendoBaskara {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		double x1;
		double x2;
		double delta;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vamos resolver Baskara! (o terror do nono ano!)");
		System.out.println("Comece digitando o valor de A: ");
		a = scan.nextDouble();
		System.out.println("Agora o valor de B: ");
		b = scan.nextDouble();
		System.out.println("Por último o valor de C: ");
		c = scan.nextDouble();
		
		delta = Math.pow(b, 2) - 4*a*c;
		
		x1 = ( - b + Math.sqrt(delta)) / (2*a);
		x2 = ( - b - Math.sqrt(delta)) / (2*a);
		
		System.out.println("Resultado de x' = " + x1);
		System.out.println("Resultado de x'' = " + x2);
				
		scan.close();
	}

}
