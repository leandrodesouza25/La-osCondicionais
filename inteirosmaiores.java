package La�ocsCondicionais;
import java.util.Scanner;
public class inteirosmaiores {

	public static void main(String[] args) {
		
		Scanner ler  = new Scanner(System.in);
		
		int a, b, c, maior = 0;
		
		System.out.println("Digite um Primeiro N�mero: ");
		a= ler.nextInt();
		
		System.out.println("Digite um Segundo N�mero: ");
		b = ler.nextInt();
		
		System.out.println("Digite um Terceiro N�mero: ");
		c = ler.nextInt();


	    if( a > b && a > c) {
	    	
	    	maior = a;
	    	
	    	System.out.println("O Primeiro � o maior");
	    }
	    else if (b > a && b > c) {
	    	
	    	maior = b;
	    			System.out.println("O Segundo � o maior");
	    }
	    else if( c > a && c > b) {
	    	
	    	maior = c;
	    	System.out.println("O Terceiro � o maior");
	    } 
			}
	

	}


