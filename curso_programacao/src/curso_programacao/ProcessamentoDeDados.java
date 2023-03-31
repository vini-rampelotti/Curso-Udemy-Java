package curso_programacao;

public class ProcessamentoDeDados {

	public static void main(String[] args) {
		
		//Exemplo1
		
		int x, y;
		
		x = 5;
		y = 2 * x;
		
		System.out.println("Exemplo 1:");
		System.out.println(x);
		System.out.println(y);
		System.out.println();
		
		//Exemplo 2
		
		int w;
		double t;
		
		w = 5;
		t = 2 * w;
		
		System.out.println("Exemplo 2:");
		System.out.println(w);
		System.out.println(t);
		System.out.println();
		
		//Exemplo3
		
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = ( b + B ) / 2.0 * h;
		
		System.out.println("Exemplo 3:");
		System.out.println(area);
		System.out.println();
		
		//Boa prática:
		//Sempre indique o tipo do número, em caso da expressão ser de ponto flutuante
		//Para double use: .0
		//Para float use: f
		
		//Exemplo4
		int c, d ;
		double resultado;
		
		c = 5;
		d = 2;
		
		resultado = c / d;
		
		System.out.println(resultado);
		
	}

}
