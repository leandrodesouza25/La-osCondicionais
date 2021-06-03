package LaçocsCondicionais;
import java.util.Scanner;
public class inteirosmaiores {

	public static void main(String[] args) {
		
		Scanner ler  = new Scanner(System.in);
		
		int a, b, c, maior = 0;
		
		System.out.println("Digite um Primeiro Número: ");
		a= ler.nextInt();
		
		System.out.println("Digite um Segundo Número: ");
		b = ler.nextInt();
		
		System.out.println("Digite um Terceiro Número: ");
		c = ler.nextInt();


	    if( a > b && a > c) {
	    	
	    	maior = a;
	    	
	    	System.out.println("O Primeiro é o maior");
	    }
	    else if (b > a && b > c) {
	    	
	    	maior = b;
	    			System.out.println("O Segundo é o maior");
	    }
	    else if( c > a && c > b) {
	    	
	    	maior = c;
	    	System.out.println("O Terceiro é o maior");
	    } 
			}
	

	}


